package file;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Yozuvchi {
    public static void main(String[] args) {
        try {
        String fileNomi = "D:\\Java\\Java-lesson-main\\src\\file//testfile.txt";
        FileWriter yozuvchi = new FileWriter(fileNomi);
            yozuvchi.write("Bu faylga malumot yozildi  Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. eworw riog igoq iogq  ");
            yozuvchi.close();
            System.out.println("Faylga malumot yozildi");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

