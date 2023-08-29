package demo2;

public interface Fileable {
    String readFile(String filename) throws Exception;
    boolean writeFile(String filename, String textToSave) throws Exception;
}
