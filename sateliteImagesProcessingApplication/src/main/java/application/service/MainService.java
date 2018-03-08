package application.service;

import application.entity.Args;
import application.entity.Feed;
import application.entity.Product;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {


    public List<Product> getProductList(Args arguments) {
        
        String urlString=constructURLString(arguments);
        CredentialsProvider provider = new BasicCredentialsProvider();
        List<Product> products = new ArrayList<>();
        String username="";
        String password="";

        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials(username, password);
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient client = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();

        HttpResponse response = null;
        String data = "";
        try {
            response = client.execute(
                    new HttpGet("https://scihub.copernicus.eu/dhus/search?q=(platformname:Sentinel-2"));

//            data = EntityUtils.toString(response.getEntity());
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(new InputSource(new StringReader(data)));
//
//            NodeList nl = doc.getElementsByTagName("entry");
//            for (int i = 0; i < nl.getLength(); i++) {
//
//                Element e = (Element) nl.item(i);
//                Node firstCNode = e.getFirstChild();
//                Node summaryNode = firstCNode.getNextSibling().getNextSibling().getNextSibling();
//                String title = firstCNode.getFirstChild().getNodeValue();///id
//                String summary=summaryNode.getNodeValue();
//                Node propertyNode = e.getLastChild();
//                Node creationDateNode = propertyNode.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling();
//                String creationDate = creationDateNode.getFirstChild().getNodeValue();
//                String ingestionDate = creationDateNode.getNextSibling().getFirstChild().getNodeValue();
//              //  String quickLook = id + "/Products('Quicklook')/$value";
//
//                Product product = new Product();
//                product.setTitle(title);
            HttpEntity entity = response.getEntity();
            InputStream xml = entity.getContent();
            JAXBContext jaxbContext = JAXBContext.newInstance(Feed.class);

            Feed timezone1 = (Feed) jaxbContext.createUnmarshaller().unmarshal(xml);
            return timezone1.getEntry();

        } catch (JAXBException  | IOException e) {
            e.printStackTrace();
            return null;
        }


}

    private String constructURLString(Args arguments) {
        String query="https://scihub.copernicus.eu/dhus/";
        // https://scihub.copernicus.eu/dhus/odata/v1/Products?$filter=year(IngestionDate) eq 2017 and month(IngestionDate) eq 12
        //https://scihub.copernicus.eu/dhus/search?q=platformname:Sentinel-1
        if(arguments.getMonth()!=null&&arguments.getMonth()!=""){
            query+="odata/v1/Products?$filter=month(IngestionDate)%20eq%20"+arguments.getMonth();
        }
        if(arguments.getPlatformName()!="" &&arguments.getPlatformName()!=null){

        }
        return query;
    }
}
