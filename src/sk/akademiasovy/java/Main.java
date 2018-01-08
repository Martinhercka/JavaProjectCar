package sk.akademiasovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1;
        Car car2;
        car1=new Car();
        car2=new Car("Skoda 120L",6.5f);

        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);

        car1.printInfo();
        System.out.println();
        car2.printInfo();

        car2.startEngine();
        car2.increaseSpeed();
        System.out.println();
        car2.printInfo();
        System.out.println();
        System.out.println("Cost: KE---)Praha:"+car2.getPrice(1600,1.33f));

    }
}
