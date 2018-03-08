package application.entity;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "feed", namespace="http://www.w3.org/2005/Atom")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feed {

    @XmlElement(name = "title")
    public String title;

    @XmlElement(name = "entry")
    public List<Product> entry;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getEntry() {
        return entry;
    }

    public void setEntry(List<Product> entry) {
        this.entry = entry;
    }
}
