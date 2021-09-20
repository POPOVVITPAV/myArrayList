public class Main {

    public static void main(String[] args) {
        MyList car= new MyList();

        car.add("Ford");
        car.add("UAZ");
        car.add("KIA");
        car.add("VAZ");
        car.add("Mitsubishi");

        for(String val : car.myList) {
            System.out.println(val);
        }
        //car.conteyns("Ford");
        //car.conteyns("Haval-Its not car");
        System.out.println(car.conteyns("Ford"));
        System.out.println(car.conteyns("Haval-Its not car"));
        System.out.println(car.indexOf("VAZ"));
        System.out.println(car.indexOf("Kalina"));
    }
}