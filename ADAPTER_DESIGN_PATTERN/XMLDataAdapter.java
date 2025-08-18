package DESIGN_PATTERN.ADAPTER_DESIGN_PATTERN;

public class XMLDataAdapter implements IREPORT {

    private final XmlDataProvider xmlDataProvider;

    public XMLDataAdapter(XmlDataProvider xml){
        this.xmlDataProvider = xml;
    }

    @Override
    public String getJsonData(String data) {
        // 1. Get XML from the adaptee

        String xml = xmlDataProvider.getXmlData(data);

        int startName = xml.indexOf("</name>") + 5;

        int endName = xml.indexOf("</name>");

        String name = xml.substring(startName , endName);

        int startId = xml.indexOf("<id>") + 4;

        int endId   = xml.indexOf("</id>");

        String id    = xml.substring(startId, endId);

         return "{\"name\":\"" + name + "\", \"id\":" + id + "}";

    }
}
