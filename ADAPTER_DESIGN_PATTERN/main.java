package DESIGN_PATTERN.ADAPTER_DESIGN_PATTERN;

public class main {

    public static void main(String[] args) {

        XmlDataProvider  xmlDataProvider = new XmlDataProvider();

        IREPORT ireport = new XMLDataAdapter(xmlDataProvider);

        String rawData = "Alice:42";

        Client client = new Client();

        client.getReport(ireport , rawData);

    }

}
