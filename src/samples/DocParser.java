package samples;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by expert on 8/10/18.
 */
public class DocParser {

    public static void main(String[] args) {
        try{
            File inputFile=new File("Samplefile.txt");
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
            Document doc=dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("root element: "+doc.getDocumentElement().getNodeName());
            NodeList nList=doc.getElementsByTagName("food");
            System.out.println("---------------------");

            for(int temp=0;temp<nList.getLength();temp++){
                Node nNode=nList.item(temp);
                System.out.println("\nCurrentElement: "+nNode.getNodeName());
                if(nNode.getNodeType()==Node.ELEMENT_NODE){
                    Element eElement=(Element) nNode;
                    System.out.println("food label: "+eElement.getAttribute("label"));
                    System.out.println("FirstName: "+eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("price: "+eElement.getElementsByTagName("price").item(0).getTextContent());


                }
            }




        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
