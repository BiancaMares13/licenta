package application.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlElement(name="title")
    private String title;
    @XmlElement(name="summary")
    private String summary;
    @XmlElement(name="ingestiondate")
    private Date ingestiondate;
    @XmlElement(name="filename")
    private String filename;
    @XmlElement(name="orbitdirection")
    private String orbitdirection;
    @XmlElement(name="platformname")
    private String platformname;
    @XmlElement(name="instrumentname")
    private String instrumentname;
    @XmlElement(name="size")
    private String size;
    @XmlElement(name="uuid")
    private String uuid;

}
