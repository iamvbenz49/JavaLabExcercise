package FileOperation;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        createFile("./FileOperation/hello.txt");
        writeFile("./FileOperation/hello.txt", "The hardest choices requires the strongest wills!!");
        appendFile("./FileOperation/hello.txt", "hey dude");
        readFromFile("./FileOperation/hello.txt");
    }
    public static void createFile(String FilePath){
        File file = new File(FilePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void writeFile(String filePath, String content){
        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(content);
        }catch(Exception e){
            System.out.println("Error occurred while writing");
        }
    }
    public static void appendFile(String filePath, String content){
        try(FileWriter writer = new FileWriter(filePath,true);){
            writer.write(content);
        }catch(Exception e){
            System.out.println("Error occurred while writing");
        }
    }
    public static void readFromFile(String filePath){
        try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = bf.readLine())!=null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Error occured while reading");
        }
    }
}
