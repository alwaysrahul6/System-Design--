package MYDOCS;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/// InterFace for documents elements

interface DocumentElemnt {

    public abstract String render();
}

/// Concrete implemention for text elements

class TextElement implements DocumentElemnt {

    private String text;

    public TextElement(String text){
        this.text = text;
    }

    public String render(){
        return text;
    }
}

/// Concrete Implementions for image elements

class ImageElement implements DocumentElemnt {

    private String imgPath;

    public ImageElement(String imgpPath){
        this.imgPath = imgPath;
    }
    public String render(){

        if (this.imgPath.endsWith(".jpg") || this.imgPath.endsWith(".png")){
            return "[Image: " + this.imgPath +  "]";
        }
        return "Image not found: ";
    }

}

///

class NewLineElement implements DocumentElemnt {

    @Override
    public String render() {
        return "\n";
    }
}

class TabSpaceElement implements DocumentElemnt {

    @Override
    public String render() {
        return "\t";
    }
}

//Holding The Collection elements

class Document{

    private List<DocumentElemnt> docElemnts = new ArrayList<>();

    public void addElments(DocumentElemnt elemnt){
        docElemnts.add(elemnt);
    }

    /// Rendering The Document

    public String render(){
        StringBuilder result = new StringBuilder();
        for (DocumentElemnt ele : docElemnts){
            result.append(ele.render());
        }
        return result.toString();
    }

}

/// Persistence Interface

interface  Persitance{

    void save(String data);
}

/// File to Save in File Manager
class FiletoSave implements Persitance{

    @Override
    public void save(String data) {
        try {
            FileWriter file = new FileWriter("Document.txt");
            file.write(data);
            file.close();
        }catch (IOException e){
            System.out.println("Exception Occurs:");
        }
    }
}

/// File To SaveDb

class SaveToDB implements Persitance{

    @Override
    public void save(String data) {
        System.out.println("Save To MongoDb");
    }
}

///  Document Editior class managing client interactions

class DocumentsEditior{
    private Document docs;

    private Persitance db;

    private String renderedDocument = "";

    public DocumentsEditior( Document docs , Persitance db){
        this.docs = docs;
        this.db = db;
    }

    public void addtext(String text){
        docs.addElments(new TextElement(text));
    }

    public void addImg(String imgpath){

        docs.addElments(new ImageElement(imgpath));
    }

    public void addNewLine(String text){

        docs.addElments(new NewLineElement());

    }

    public void addTabSpace(String text){

        docs.addElments(new TabSpaceElement());

    }

    public String renderDocument(){
       if (renderedDocument.isEmpty()){
           renderedDocument = docs.render();

        }
       return renderedDocument;
    }
    public void saveDocument(){
        db.save(renderDocument());
    }
}



/// Client usage Example.

public class GoodDesign_Docs {
    public static void main(String[] args) {

        Document document = new Document();

        Persitance persitance = new FiletoSave();

        DocumentsEditior editior = new DocumentsEditior(document , persitance);

        editior.addtext("Hello World");
        System.out.println(editior.renderDocument());

    }
}