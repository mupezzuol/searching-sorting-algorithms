package algorithms.searching_sorting.model;

import org.junit.Before;
import org.junit.Test;

import algorithms.searching_sorting.mock.CarMock;
import algorithms.searching_sorting.models.Car;

public class SearchCarTest {
	
	private Car[] mockCars;

	@Before
	public void setUp() {
		this.mockCars = new CarMock().getMockCars();
	}
	
	@Test
	public void mustSearchCar() {
		
		for (Car car : mockCars) {
			System.out.println("Name: " + car.getName());
		}
		
	}

}
