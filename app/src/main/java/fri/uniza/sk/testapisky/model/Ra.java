package fri.uniza.sk.testapisky.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Created by Martin on 14.03.2017.
 */

public class Ra
{
    @Text(required = false)
    private Double ra;
    @Attribute(required = false)
    private String unit;

    public Ra() {
    }

    public Ra(Double content, String unit) {
        this.ra = content;
        this.unit = unit;
    }

    public Double getRa()
    {
        return ra;
    }

    public void setRa(Double ra)
    {
        this.ra = ra;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ra = "+ ra +", unit = "+unit+"]";
    }
}
