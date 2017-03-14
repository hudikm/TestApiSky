package fri.uniza.sk.testapisky.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Created by Martin on 14.03.2017.
 */
public class De
{
    @Text(required = false)
    private Double de;

    @Attribute(required = false)
    private String unit;

    public De(Double content, String unit) {
        this.de = content;
        this.unit = unit;
    }

    public De() {
    }

    public Double getDe()
    {
        return de;
    }

    public void setDe(Double de)
    {
        this.de = de;
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
        return "ClassPojo [de = "+ de +", unit = "+unit+"]";
    }
}
