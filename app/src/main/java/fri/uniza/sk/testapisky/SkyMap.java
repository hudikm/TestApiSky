package fri.uniza.sk.testapisky;

import fri.uniza.sk.testapisky.model.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Martin on 14.03.2017.
 */

public interface SkyMap {
    @GET ("search")
    Call<Response> getStar(@Query("star") String object);

}
