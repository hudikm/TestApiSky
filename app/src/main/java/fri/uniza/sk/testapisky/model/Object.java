package fri.uniza.sk.testapisky.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/*
    <object id="S251">
    <type id="1">Star</type>
    <name>α UMi</name>
    <catId>α UMi</catId>
    <constellation id="84">Ursa Minor</constellation>
    <ra unit="hour">2.5301944</ra>
    <de unit="degree">89.264167</de>
    <mag>2.02</mag>
</object>*/
public class Object
{
    @Attribute(required = false)
    private String id;

    @Element(required = false)
    private De de;

    @Element(required = false)
    private Ra ra;

    @Element(required = false)
    private Constellation constellation;

    @Element(required = false)
    private String name;

    @Element(required = false)
    private Double mag;

    @Element(required = false)
    private String catId;

    @Element(required = false)
    private Type type;

    public Object(String id, De de, Ra ra, Constellation constellation, String name, Double mag, String catId, Type type) {
        this.id = id;
        this.de = de;
        this.ra = ra;
        this.constellation = constellation;
        this.name = name;
        this.mag = mag;
        this.catId = catId;
        this.type = type;
    }

    public Object() {
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public De getDe ()
    {
        return de;
    }

    public void setDe (De de)
    {
        this.de = de;
    }

    public Ra getRa ()
    {
        return ra;
    }

    public void setRa (Ra ra)
    {
        this.ra = ra;
    }

    public Constellation getConstellation ()
    {
        return constellation;
    }

    public void setConstellation (Constellation constellation)
    {
        this.constellation = constellation;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Double getMag ()
    {
        return mag;
    }

    public void setMag (Double mag)
    {
        this.mag = mag;
    }

    public String getCatId ()
    {
        return catId;
    }

    public void setCatId (String catId)
    {
        this.catId = catId;
    }

    public Type getType ()
    {
        return type;
    }

    public void setType (Type type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", de = "+de+", ra = "+ra+", constellation = "+constellation+", name = "+name+", mag = "+mag+", catId = "+catId+", type = "+type+"]";
    }
}

