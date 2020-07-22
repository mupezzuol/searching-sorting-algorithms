package algorithms.searching_sorting.interfaces;

import algorithms.searching_sorting.models.Grade;

public interface ISortGrade {

    public Grade[] mergeSort(Grade[] grades, int begin, int end);
    public void order(Grade[] grades, int begin, int end);
    public void merge(Grade[] grades, int begin, int middle, int end);

}
