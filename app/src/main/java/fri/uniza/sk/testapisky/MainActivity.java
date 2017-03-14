package fri.uniza.sk.testapisky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import fri.uniza.sk.testapisky.model.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Info - odpoznamkovat iba pre potreby debugovania */
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//// set your desired log level
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//// add your other interceptors …
//// add logging as last interceptor
//        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://server1.sky-map.org/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                //.client(httpClient.build()) // V pripade debugovanie odpoznamkovat
                .build();

        SkyMap skyMap = retrofit.create(SkyMap.class);
        Call<Response> polaris = skyMap.getStar("polaris");

        polaris.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                final Response body = response.body();
                Log.d("SkyMap", body.toString());


            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

                Log.d("SkyMap", "Error", t);

            }
        });
    }
}
