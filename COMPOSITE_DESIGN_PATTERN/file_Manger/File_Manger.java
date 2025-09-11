package DESIGN_PATTERN.COMPOSITE_DESIGN_PATTERN.file_Manger;

public interface File_Manger {
    void openAll(int indent);

    int getSize();

    String getName();

    boolean isFolder();

    File_Manger cd(String name);

    void ls(int indent);
}
