package be.ehb.generatieservice.xml;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

//Wordt niet meer gebruikt
public class GetData {

    public void getInput() {

        try {
            File file = new File("users.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("user");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nNode Name: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    String userId = eElement.getElementsByTagName("id").item(0).getTextContent();
                    String firstName = eElement.getElementsByTagName("firstname").item(0).getTextContent();
                    String lastName = eElement.getElementsByTagName("lastname").item(0).getTextContent();
                    String registerNumber = eElement.getElementsByTagName("registernumber").item(0).getTextContent();
                    String martitalStatus = eElement.getElementsByTagName("maritalstatus").item(0).getTextContent();
                    String street = eElement.getElementsByTagName("street").item(0).getTextContent();
                    String houseNumber = eElement.getElementsByTagName("housenumber").item(0).getTextContent();
                    String zip = eElement.getElementsByTagName("zip").item(0).getTextContent();
                    String location = eElement.getElementsByTagName("location").item(0).getTextContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
