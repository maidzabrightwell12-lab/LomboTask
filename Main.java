

public class Main {
    public static void main(String[] args) {

        CarWithLombok car1 = new CarWithLombok(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        CarWithLombok car2 = new CarWithLombok(
                "GLE", "Mercedes", 2023, 200000, "silver", 3
        );

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Car 1 color: " + car1.getColor());

        car1.setColor("black");

        System.out.println("Car 1 new color: " + car1.getColor());

        System.out.println("Are these objects equal? "
                + car1.equals(car2));

        System.out.println("Car 1 hashCode: " + car1.hashCode());
        System.out.println("Car 2 hashCode: " + car2.hashCode());
    }
}
