public class Array {
    public  static void main(String[] args) {
        String[] cars = {"mers" , "bwm" , "volvo", "gm"};
//        System.out.println(cars[2]);
//        cars[2]="mazda";
//        System.out.println(cars[2]);
//        System.out.println(cars.length);
        // For loop
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
        // for each
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
