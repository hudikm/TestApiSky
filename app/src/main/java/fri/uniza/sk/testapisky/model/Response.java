package fri.uniza.sk.testapisky.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/*
<response>
<request>polaris</request>
<status>0</status>
<verbiage>OK</verbiage>
<object id="S251">
    <type id="1">Star</type>
    <name>α UMi</name>
    <catId>α UMi</catId>
    <constellation id="84">Ursa Minor</constellation>
    <ra unit="hour">2.5301944</ra>
    <de unit="degree">89.264167</de>
    <mag>2.02</mag>
</object>

<object id="S251">
<type id="1">Star</type>
<name>α UMi</name>
<catId>α UMi</catId>
<constellation id="84">Ursa Minor</constellation>
<ra unit="hour">2.5301944</ra>
<de unit="degree">89.264167</de>
<mag>2.02</mag>
</object>
</response>
 */
@Root
public class Response {
    @Element(required = false)
    private String status = null;
    @Element(required = false)
    private String request = null;
    @ElementList(required = false, inline = true)
    private List<Object> object;
    @Element(required = false)
    private String verbiage = null;

    public Response() {
        super();
    }

    public Response(String status, String request, List<Object> object, String verbiage) {
        this.status = status;
        this.request = request;
        this.object = object;
        this.verbiage = verbiage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public List<Object> getObject() {
        return object;
    }

    public void setObject(List<Object> object) {
        this.object = object;
    }

    public String getVerbiage() {
        return verbiage;
    }

    public void setVerbiage(String verbiage) {
        this.verbiage = verbiage;
    }

    @Override
    public String toString() {
        return "ClassPojo [status = " + status + ", request = " + request + ", object = "+ object + ", verbiage = " + verbiage + "]";
    }
}