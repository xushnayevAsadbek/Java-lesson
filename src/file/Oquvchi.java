package file;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Oquvchi {
    public static void main(String[] args) {
       try{
        String fileNomi = "D:\\Java\\Java-lesson-main\\src\\file\\testfile.txt";
        File fayl = new File(fileNomi);
        Scanner  oquvchi = new Scanner(fayl);
        while (oquvchi.hasNextLine()) {
            String data = oquvchi.nextLine();
            System.out.println(data);
        }
        oquvchi.close();
         
       } catch(FileNotFoundException e){
              System.out.println("Bu fayl topilmadi");
         }
    }
}
