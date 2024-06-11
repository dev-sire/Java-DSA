import java.io.File;

public class FileSystemTraversal {
    public static void traverseDirectory(File directory) {
        File[] files = directory.listFiles();

        if(files != null) {
            for (File file : files) {
                if(file.isDirectory()){
                    traverseDirectory(file);
                } else {
                    System.out.println("File "+ file.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args) {
        String directoryPath = "C:/Notes";
        traverseDirectory(new File(directoryPath));
    }
}
