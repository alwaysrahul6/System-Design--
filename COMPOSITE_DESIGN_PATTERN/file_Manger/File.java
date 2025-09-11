package DESIGN_PATTERN.COMPOSITE_DESIGN_PATTERN.file_Manger;

public class File implements File_Manger{

    private String name;

    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void openAll(int indent) {
        String indentSpace = " ".repeat(indent);
        System.out.println(indentSpace + name);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }

    @Override
    public File_Manger cd(String name) {
        return null;
    }

    @Override
    public void ls(int indent) {
        String indentSpace = " ".repeat(indent);
        System.out.println(indentSpace + name);
    }

}
