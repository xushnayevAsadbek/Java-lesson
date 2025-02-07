package file;
import java.io.File;
import java.io.IOException;
public class App {
    public static void main(String[] args) {
        String fileNomi = "D:\\Java\\Java-lesson-main\\src\\file//testfile.txt";
        File file = new File(fileNomi);
        try{
            if (file.createNewFile()) {
                System.out.println("Fayl hosil qilindi: " + file.getName());
                System.out.println("Fayl manzili: " + file.getAbsolutePath());
            }else{
                System.out.println("Bu fayl mavjud");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
