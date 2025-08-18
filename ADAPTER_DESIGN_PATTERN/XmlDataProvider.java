package DESIGN_PATTERN.ADAPTER_DESIGN_PATTERN;

public class XmlDataProvider {

    String getXmlData(String data){
        int sep = data.indexOf(':');
        String name = data.substring(0 , sep);
        String id = data.substring(sep + 1);

        return "<user>" + name + "<id>" + id + "</id>" + "</user>";
    }

}
