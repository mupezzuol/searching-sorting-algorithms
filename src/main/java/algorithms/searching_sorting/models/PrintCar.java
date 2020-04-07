package algorithms.searching_sorting.models;

import algorithms.searching_sorting.interfaces.IPrintCar;

public class PrintCar implements IPrintCar {

    @Override
    public void printCars(Car[] cars) {
        for (Car c : cars) {
            System.out.println("Name: "+c.getName());
            System.out.println("Price: "+c.getPrice());
            System.out.println();
        }
    }

    @Override
    public void printCar(Car car) {
        System.out.println("Car: "+ car.getName().toString());
        System.out.println("Price: "+ car.getPrice().toString());
    }

}
