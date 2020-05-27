package algorithms.searching_sorting.models;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import algorithms.searching_sorting.mock.CarMock;

public class SearchCarTest {
	
	private Car[] mockCars;

	@Before
	public void setUp() {
		this.mockCars = new CarMock().getMockCars();
	}
	
	@Test
	public void mustSearchLowestValue() {
		int indexLowestValue = new SearchCar()
				.searchLowestValue(this.mockCars, 0, this.mockCars.length-1);
		assertThat(6, equalTo(indexLowestValue));
	}
	
	@Test
	public void mustSearchLowestValueCustom() {
		int indexLowestValue = new SearchCar()
				.searchLowestValue(this.mockCars, 0, 3);
		assertThat(2, equalTo(indexLowestValue));
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldNotSearchWithAnArrayLargerThanItsSize() {
		new SearchCar().searchLowestValue(this.mockCars, 0, this.mockCars.length);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldNotFetchWithNegativeIndexArray() {
		new SearchCar().searchLowestValue(this.mockCars, -3, this.mockCars.length-1);
	}

}
