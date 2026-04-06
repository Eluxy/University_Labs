import java.io.File;

public class zad2 {
    public static void main(String[] args) {
        String DirectoryPath = "D:\\test";

        File directory = new File(DirectoryPath);

        File[] filesAndDirs = directory.listFiles();

        for(File fileOrDir : filesAndDirs) {
            System.out.println(fileOrDir.getName());
        }
    }
}
