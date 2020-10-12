package algorithms.searching_sorting.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.searching_sorting.mock.CarMock;

public class SortCarTest {

    private Car[] mockCars;
    private Car[] carsSorted;

    @Before
    public void setUp() {
        this.mockCars = new CarMock().getMockCars();
        this.carsSorted = new CarMock().getMockCarsSorted();
    }

    @Test
    public void mustSortListCarsWithSelectionSort() {
        Car[] sortCar = new SortCar().selectionSort(this.mockCars, this.mockCars.length);
        assertEquals(7, sortCar.length);
        for (int i = 0; i < sortCar.length; i++) {
            assertEquals(this.carsSorted[i].getName(), sortCar[i].getName());
        }
    }

    @Test
    public void mustSortListCarsWithInsertionSort() {
        Car[] sortCar = new SortCar().insertionSort(this.mockCars, this.mockCars.length);
        assertEquals(7, sortCar.length);
        for (int i = 0; i < sortCar.length; i++) {
            assertEquals(this.carsSorted[i].getName(), sortCar[i].getName());
        }
    }

}
