package fri.uniza.sk.testapisky.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;

/**
 * Created by Martin on 14.03.2017.
 */

public class Constellation {
    @Attribute(required = false)
    private String id;

    @Text(required = false)
    private String content;

    public Constellation(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public Constellation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", content = " + content + "]";
    }
}
