package file;

import java.io.File;

public class Ochirish {
    public static void main(String[] args) {
        String fileNomi = "D:\\Java\\Java-lesson-main\\src\\file\\testfile.txt";
        File fayl = new File(fileNomi);
        if (fayl.delete()) {
            System.out.println("Fayl o'chirildi: " + fayl.getName());
        } else {
            System.out.println("Fayl o'chirilmadi");
            
        }
    }
}
