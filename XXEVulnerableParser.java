import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.File;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.IOException;

public class XXEVulnerableParser {

    public static void main(String[] args) {
        try {
            // Load XML file
            File xmlFile = new File("example.xml");

            // Create DocumentBuilderFactory
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            // Create DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Parse the XML file
            Document doc = db.parse(xmlFile);

            // Print root element
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
