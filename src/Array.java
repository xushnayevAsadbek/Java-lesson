public class Array {
//    static void  metodName(String ism) {
//        System.out.println("Hello World " + ism);
//    }
//    static  String ism(){
//        return "Hello";
//    }
    static void salom(String ism){
        System.out.println("Hello World " + ism);
    }
    static String ism(){
        return "Aziz";
    }
    static int size(int x , int y){
        return  x+y ;
    }
    static double size (double x , double y){
        return x+y ;
    }

    public  static void main(String[] args) {
        int intsize = size(10,20);
        double doublesize = size(12.6,5.4);
        System.out.println(intsize);
        System.out.println(doublesize);
//        String [] ismlar  = {"dss" , " ghf" , "dfr"};
//        for(String ism : ismlar){
//            salom(ism);
//        }

//        String [] ismlar = {"az","boff","fdsg"};
//                for (String ism : ismlar) {
//    metodName(ism);
//                }
//        String[] cars = {"mers" , "bwm" , "volvo", "gm"};
//        System.out.println(cars[2]);
//        cars[2]="mazda";
//        System.out.println(cars[2]);
//        System.out.println(cars.length);
        // For loop
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
        // for each
//        for (String car : cars) {
//            System.out.println(car);
//        }
        // kop olchovli massivlar
//        int [] [] raqamlar = {
//                {1,3,5},
//                {2,4,6}
//        };
//        for (int i = 0; i < raqamlar.length; i++) {
//            for (int j = 0; j < raqamlar[i].length; j++) {
//                System.out.println(raqamlar[i][j]);
//
//            }
//        }
//        for (int[] x: raqamlar) {
//            for(int y: x) {
//                System.out.println(y);
//            }
//        }

    }
}
