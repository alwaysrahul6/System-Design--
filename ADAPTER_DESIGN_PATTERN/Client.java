package DESIGN_PATTERN.ADAPTER_DESIGN_PATTERN;

public class Client {
   
    public void getReport(IREPORT ireport , String raw){

        System.out.println("Procced json Data :" + ireport.getJsonData(raw));
    }

}

