import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Car;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phones\n"+Arrays.toString(phones()));
        System.out.println("———‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖———");





        //  System.out.println("———————————————————————————————————————————————————");

        System.out.println("CARS");
        Car car = new Car("White", 2016);
        Car car1 = new Car("Black", 2021);
        Car[] cars = {car, car1};
        for (Car car2:cars) {
            System.out.println(car2);
            System.out.println("———‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖———");
        }


        System.out.println("HOMES");
        Home home = new Home("Rich: 💒💒", 500);
        Home home1 = new Home("🏯", 600);
        Home[] homes = {home, home1};
        for (Home home2 :homes) {
            System.out.println(home2);
            System.out.println("———‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖———");
        }


        System.out.println("LAPTOPS");
        Laptop laptop = new Laptop("MacOs",
                "💻",
                50000,
                "Bu",
                "Mac");
        Laptop laptop1 = new Laptop("Dell",
                "🖥",
                3000,
                "Bu",
                "Windows 11");
        Laptop[] laptops = {laptop, laptop1};
        for (Laptop laptop2:laptops) {
            System.out.println(laptop2);
            System.out.println("———‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖‖———");
        }


    }

    public static Phone[] phones() {
        return new Phone[]{
                new Phone("Huba",
                        "📱",
                        6000,
                        "zynk!",
                        "Kyrgyzstan",
                        120),
                new Phone("Iphone",
                        "📳",
                        5000,
                        "BU",
                        "USA",
                        130)
        };

    }
}
