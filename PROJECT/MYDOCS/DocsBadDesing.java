package MYDOCS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocsBadDesing {
   private List<String> documentElements;
   private String renderDocuments;

   public DocsBadDesing(){
       documentElements = new ArrayList<>();
       renderDocuments = "";
   }

   /// Add text

    public void addText(String text){
        documentElements.add(text);
    }

    /// Add image

    public void addImage(String imgPath){
        documentElements.add(imgPath);
    }

    /// Rendering The docoument

    public String renderDocuments(){
        if (renderDocuments.isEmpty()){
            StringBuilder result  = new StringBuilder();
            for (String elments:documentElements){
                if (elments.length() > 4 && elments.endsWith(".jpg") || elments.endsWith(".png") ){
                    result.append("[Image : ").append(elments).append("]\n");
                }else{
                    result.append(elments).append("\n");
                }
            }
            renderDocuments = result.toString();
        }
        return renderDocuments;
    }
    public void savetoFile(){
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write((renderDocuments()));
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: unable to open file for writing.");
        }
    }

    public static void main(String[] args) {
        DocsBadDesing mydocs = new DocsBadDesing();
        mydocs.addText("Hey Welcome");
        mydocs.addImage("picture.jpg");
        System.out.println(mydocs.renderDocuments());
        mydocs.savetoFile();
    }
}
