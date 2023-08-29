package demo2;

public class Start {
    public static void main(String[] args) throws Exception {
        FileManager fileManager = new FileManager();

        String data = "Hello World!  \n How are you? \n I am fine";
        System.out.println (fileManager.writeFile("src/demo2/myTextFile.txt", data));

        System.out.println (fileManager.readFile("src/demo2/myTextFile.txt"));

      
    }
}
