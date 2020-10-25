package be.ehb.generatieservice.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class GetData {
    public static void main(String[] args) {
        try {
            File file = new File("test.xml");
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
                    System.out.println("User Id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("First name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Register number: " + eElement.getElementsByTagName("registernumber").item(0).getTextContent());
                    System.out.println("Marital status: " + eElement.getElementsByTagName("maritalstatus").item(0).getTextContent());
                    System.out.println("Address" + node.getNodeType());
                    System.out.println("Street: " + eElement.getElementsByTagName("street").item(0).getTextContent());
                    System.out.println("House number: " + eElement.getElementsByTagName("housenumber").item(0).getTextContent());
                    System.out.println("Zip code: " + eElement.getElementsByTagName("zip").item(0).getTextContent());
                    System.out.println("Location: " + eElement.getElementsByTagName("location").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
