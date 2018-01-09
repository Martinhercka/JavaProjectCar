package sk.akademiasovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1;
        Car car2;
        Car car3;
        car1=new Car();
        car2=new Car("Skoda 120L",6.5f,"Presov");
        car3=new Car("Seat Ibiza",7.1f,"Bratislava");

        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);

        car1.printInfo();
        System.out.println();
        car2.printInfo();

        car2.startEngine();
        car2.increaseSpeed(80);
        System.out.println();
        car2.printInfo();
        System.out.println();
        System.out.println("Cost: KE---)Praha:"+car2.getPrice(1600,1.33f));
        car1.startEngine();
        car1.increaseSpeed(90);
        car1.turnOnFrontWiper();
        car1.printInfo();

        System.out.println();

        if (car2.getSpeed()>car1.getSpeed())
            System.out.println("Skoda 120L is faster");
        else if(car1.getSpeed()>car2.getSpeed())
            System.out.println("Audi A8 is faster");
        else if(car1.getSpeed()==car2.getSpeed())
            System.out.println("Same speed");
        car3.printInfo();



    }




}
