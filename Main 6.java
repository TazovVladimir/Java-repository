public class Main {
    public static void main(String[] args) {
        FileSystem file = new FileSystem();
        file.getPath();
        file.getSize();

        file.fileToTwo();
        file.getPath();
        file.getSize();

        file.fileToOne();
        file.getPath();
        file.getSize();
    }
}
class FileSystem{
    int folderSize = 1;
    int fileSize = 40;

    String filePath = "/home";
    String file = "/File.exe";
    String folderOne = "/folderOne";
    String folderTwo = "/folderTwo";

    void fileToTwo(){
        filePath += folderTwo + file;
        folderSize += fileSize;
    }
    void getPath(){
        System.out.println("Путь файла - " + filePath);
    }
    void getSize(){
        System.out.println("Размер папки - " + folderSize + " mb");
    }
    void fileToOne(){
        filePath += folderOne + file;
        folderSize += fileSize;
    }
}