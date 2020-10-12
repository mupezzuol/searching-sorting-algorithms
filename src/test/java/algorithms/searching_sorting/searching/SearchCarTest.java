package algorithms.searching_sorting.searching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.model.Car;
import algorithms.searching_sorting.model.Grade;
import org.junit.Before;
import org.junit.Test;

import algorithms.searching_sorting.mock.CarMock;

public class SearchCarTest {

    private Car[] mockCars;
    private Grade[] mockGrades;
    private Grade[] gradesSorted;

    @Before
    public void setUp() {
        this.mockCars = new CarMock().getMockCars();
        this.mockGrades = new GradeMock().getMockGrades();
        this.gradesSorted = new GradeMock().getMockGradesSorted();
    }

    @Test
    public void mustSortListGradesWithQuickSort() {
        Grade[] sortGrade = new Search().quickSort(this.mockGrades, 0, this.mockGrades.length);
        assertEquals(11, sortGrade.length);
        for (int i = 0; i < sortGrade.length; i++) {
            assertEquals(this.gradesSorted[i].getStudent(), sortGrade[i].getStudent());
        }
    }

    @Test
    public void mustSearchWithBinarySearchFound() {
        Search search = new Search();
        mockGrades = search.quickSort(mockGrades, 0, mockGrades.length);

        double value = 9.3;
        int positionFound = search.binarySearch(mockGrades, 0, mockGrades.length, value);

        assertNotEquals(-1, positionFound);
    }

    @Test
    public void mustSearchWithBinarySearchNotFound() {
        Search search = new Search();
        mockGrades = search.quickSort(mockGrades, 0, mockGrades.length);

        double value = 1.1;
        int positionFound = search.binarySearch(mockGrades, 0, mockGrades.length, value);

        assertEquals(-1, positionFound);
    }

    @Test
    public void mustSearchLowestValue() {
        int indexLowestValue = new Search()
                .searchLowestValue(this.mockCars, 0, this.mockCars.length - 1);
        assertThat(6, equalTo(indexLowestValue));
    }

    @Test
    public void mustSearchLowestValueCustom() {
        int indexLowestValue = new Search()
                .searchLowestValue(this.mockCars, 0, 3);
        assertThat(2, equalTo(indexLowestValue));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldNotSearchWithAnArrayLargerThanItsSize() {
        new Search().searchLowestValue(this.mockCars, 0, this.mockCars.length);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldNotFetchWithNegativeIndexArray() {
        new Search().searchLowestValue(this.mockCars, -3, this.mockCars.length - 1);
    }

}
