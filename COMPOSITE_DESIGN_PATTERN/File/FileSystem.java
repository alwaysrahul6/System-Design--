package DESIGN_PATTERN.COMPOSITE_DESIGN_PATTERN.File;

import DESIGN_PATTERN.COMPOSITE_DESIGN_PATTERN.file_Manger.Folder;

public class FileSystem {

    private static FileSystem insatance;
    private static Folder root;




    public static synchronized FileSystem getInsatance(){
        if (insatance == null){
            return new FileSystem();
        }
        return insatance;
    }

    public Folder getroot(){
        return root;
    }

    public void ls(){
        root.ls(0);
    }

    public void openAll(){
        root.openAll(0);
    }
}
