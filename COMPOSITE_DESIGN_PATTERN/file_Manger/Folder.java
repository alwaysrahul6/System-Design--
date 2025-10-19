hupackage DESIGN_PATTERN.COMPOSITE_DESIGN_PATTERN.file_Manger;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File_Manger{

    private final String FolderName;

    private static List<File_Manger> childern;

    public Folder(String folder){
        this.FolderName = folder;
        childern = new ArrayList<>();
    }

    public static void addItem(File_Manger item){
        childern.add(item);
    }

    @Override
    public void openAll(int indent) {
        String IndentSpace = " ".repeat(indent);
        System.out.println(IndentSpace + " + "+ FolderName);
        for (File_Manger child : childern){
            child.openAll(indent + 4);
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (File_Manger child : childern ){
            total+= child.getSize();
        }
        return total;
    }

    @Override
    public String getName() {
        return FolderName;
    }

    @Override
    public boolean isFolder() {
        return true;
    }

    @Override
    public File_Manger cd(String name) {
        for (File_Manger child : childern){
            if (child.isFolder() && child.getName().equals(name)){
                return child;
            }
        }
        return null;
    }

    @Override
    public void ls(int indent) {
        String indentSpace = " ".repeat(indent);

        for (File_Manger child : childern){
            if (child.isFolder()){
                System.out.println(indentSpace + " + " + child.getName());
            }else {
                System.out.println(indentSpace + child.getName());
            }
        }
    } 
}
