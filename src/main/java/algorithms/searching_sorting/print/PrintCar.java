package algorithms.searching_sorting.print;


import algorithms.searching_sorting.model.Car;

public class PrintCar {

    public void printCars(Car[] cars) {
        for (Car c : cars) {
            System.out.println("Name: "+c.getName());
            System.out.println("Price: "+c.getPrice());
            System.out.println();
        }
    }

    public void printCar(Car car) {
        System.out.println("Car: "+ car.getName());
        System.out.println("Price: "+ car.getPrice().toString());
    }

}
