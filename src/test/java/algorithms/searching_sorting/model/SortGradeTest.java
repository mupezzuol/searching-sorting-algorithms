package algorithms.searching_sorting.model;

import algorithms.searching_sorting.mock.GradeMock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortGradeTest {

    private Grade[] mockGrades;
    private Grade[] gradesSorted;

    @Before
    public void setUp() {
        this.mockGrades = new GradeMock().getMockGrades();
        this.gradesSorted = new GradeMock().getMockGradesSorted();
    }

    @Test
    public void mustSortListGradesWithMergeSort() {
        Grade[] sortGrade = new SortGrade().mergeSort(this.mockGrades, 0, this.mockGrades.length);
        assertEquals(11, sortGrade.length);
        for (int i = 0; i < sortGrade.length; i++) {
            assertEquals(this.gradesSorted[i].getStudent(), sortGrade[i].getStudent());
        }
    }
}