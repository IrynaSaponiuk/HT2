import dev.failsafe.internal.util.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.xml.sax.SAXException;

public class PrintPomDependenciesClass {

    public void printPomDependencies() throws IOException, SAXException, ParserConfigurationException {
        File pomFile = new File("C:\\Users\\Админ\\HT_2\\pom.xml");

        DocumentBuilderFactory document = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = document.newDocumentBuilder();
        Document doc = db.parse(pomFile);
        doc.getDocumentElement().normalize();
        final NodeList dependencyNodes = doc.getElementsByTagName("dependency");

        String version = "version";
        String artifactId = "artifactId";

        for (int i = 0; i < dependencyNodes.getLength(); i++) {
            final Node n = dependencyNodes.item(i);

            final NodeList list = n.getChildNodes();

            System.out.println("----------------------------------");
            for (int j = 0; j < list.getLength(); j++) {
                final Node n2 = list.item(j);
                if (n2.getNodeType() != Node.ELEMENT_NODE) continue;
                if (n2.getNodeName() != version && n2.getNodeName() != artifactId) continue;
                System.out.println(n2.getNodeName() + ":" + n2.getTextContent());
            }
        }
        NodeList nodeList
                = doc.getElementsByTagName("dependency");
        Node node = nodeList.item(0);
        Element tElement = (Element) node;
        if (Objects.equals(tElement.getElementsByTagName(artifactId).item(0).getTextContent(), "testng"))
            if (Objects.equals(tElement.getElementsByTagName(version).item(0).getTextContent(), "7.4.0")) {
                System.out.println("TESTNG VERSION IS 7.4.0");
            }
    }
}
