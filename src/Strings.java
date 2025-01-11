public class Strings {
    public static void main (String[] args){
//        String ism = "Akmal";
//        System.out.println(ism.length());
//        System.out.println(ism.toUpperCase());
//        System.out.println(ism.toLowerCase());
//        String text = "Hello World Lorem Ipsum is simply dummy text of the printing and typesetting industry";
//        System.out.println(text.indexOf("World"));
//        System.out.println(text.length());
        // Stringlarni qoshish
//        String text2 = "Lorem ipsum  dummy text of ";
//        String text3 = "Lorem ipsum fffx dfdcdf";
//        System.out.println(text2 + text3);
//        System.out.println(text2.concat(text3));
        int number1 = 6 ;
        int number2 = 5 ;
        if (number1 >number2){
            System.out.println(number1);
        } else if (number2 == number1) {
            System.out.println(number2);
        }else{
            System.out.println(0);
        }
        //Tanlash operatorlari
        int haftakuni =5;
        switch(haftakuni){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            default:
                System.out.println("Bunday hafta kuni yo'q");

       String word = "apple";
       switch (word){
           case "apple":
               System.out.println("Olma");
               break;
               case "orange":
                   System.out.println("Apelsin");
                   break;
           default:
               System.out.println("Bunday so'z yoq");
       }
        }
    }

}
