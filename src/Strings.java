public class Strings {
    public static void main (String[] args){
        String ism = "Akmal";
        System.out.println(ism.length());
        System.out.println(ism.toUpperCase());
        System.out.println(ism.toLowerCase());
        String text = "Hello World Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        System.out.println(text.indexOf("World"));
        System.out.println(text.length());
        // Stringlarni qoshish
        String text2 = "Lorem ipsum  dummy text of ";
        String text3 = "Lorem ipsum fffx dfdcdf";
        System.out.println(text2 + text3);
        System.out.println(text2.concat(text3));
    }

}
