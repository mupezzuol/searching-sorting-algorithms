# Java Algorithms - Searching and Sorting

Implementation of search and ordering algorithms.

## Index :pushpin:

- [Searching Algorithms](#searching)
- [Sorting Algorithms](#sorting)
- [Tests](#tests)
- [Analyzing the Algorithms](#analyze)

## Searching Algorithms <a name="searching"></a>:mag_right:

#### Search Lowest Value

- Finding the lowest value in an array indicating the start and end of the search index.

```java
public int searchLowestValue(Car[] cars, int beginPosition, int endPosition) {
    int cheaper = beginPosition;
    for (int current = beginPosition; current <= endPosition; current++) {
        if (cars[current].getPrice() < cars[cheaper].getPrice()) {
            cheaper = current;
        }
    }
    return cheaper;
}
```

#### Change Position

- Algorithm used to change the position of the array values.

```java
public void changePosition(Car[] cars, int first, int second){
    Car firstCar = cars[first];
    Car secondCar = cars[second];
    cars[first] = secondCar;
    cars[second] = firstCar;
}
```

## Sorting Algorithms <a name="sorting"></a>:1234:

- Below are the ordering algorithms implemented in the project.

#### Selection Sort

- From the current pointer I scroll through my complete array and search for the lowest value and change positions.

```java
public Car[] selectionSort(Car[] cars, int numberOfElements) {
    ISearchCar searchCar = new SearchCar();
    for (int current = 0; current < numberOfElements - 1; current++) {
        int lowestValue = searchCar.searchLowestValue(cars, current, numberOfElements - 1);
        changePosition(cars, current, lowestValue);
    }
    return cars;
}
```

#### Insertion Sort

- From the current element I compare if the value is smaller with the elements on the left, until I reach the right position.

```java
public Car[] insertionSort(Car[] cars, int numberOfElements) {
    for(int current = 1; current < numberOfElements; current++){
        int analyze = current;
        while (analyze > 0 && cars[analyze].getPrice() < cars[analyze-1].getPrice()){
            changePosition(cars, analyze, analyze-1);
            analyze--;
        }
    }
    return cars;
}
```

## Tests <a name="tests"></a>:white_check_mark:

- in progress...

## Analyzing the Algorithms <a name="analyze"></a>:chart_with_upwards_trend:

- Below are some analyzes of the implemented algorithms._[XLSX](resources/analysis_of_algorithms.xlsx)_
- Numbers are symbolic examples for analyzing the differences between the types of algorithms.

#### Search Lowest Value - Linear

- This algorithm we execute a 'for' that sweeps N elements, however we have an IF where we can also execute 2N.
- This algorithm is a linear algorithm, because I will always double, or quadruple and there will always be a linear line.

![Search Lowest Value](resources/img/search-lowest-value.png)

#### Selection Sort - Quadratic

- In this algorithm, we execute a 'for' that scans N elements, however, we have a call to another algorithm (search lowest value) where it can also have the same complexity already analyzed. So in this case we have N elements raised to 2 and we can have twice that.
- This algorithm is a quadratic algorithm, because when the number of elements increases, the operations grow in a quadratic, rather than linear way.

![Selection Sort](resources/img/selection-sort.png)

#### Insertion Sort - Quadratic

- In this algorithm, we execute a 'for' that sweeps N elements, where we can make N elements to the left too, however, we have a call to another algorithm (search for the lowest value), where it can also have the same complexity already analyzed. So, in this case, we have N elements increased to 2 and we can have twice that.
- This algorithm is a quadratic algorithm, because when the number of elements increases, the operations grow in a quadratic, rather than linear way.

![Insertion Sort](resources/img/insertion-sort.png)

#### Linear X Quadratic

- The linear algorithm is so low that we cannot see it, because the quadratic algorithm grows absurdly fast.
- In algorithm analysis we are always concerned with power, as it will make all the difference in the comparison.

![Linear and Quadratic](resources/img/linear-quadratic.png)

- Example with few elements to visualize the lines of the linear algorithm.

![Linear and Quadratic - Basic](resources/img/linear-quadratic-basic.png)

#### Comparisons and Illustration

- We use the letter <kbd>O</kbd> to demonstrate the complexity of an algorithm, we call this analysis _`Asymptotic Analysis`_.

Demonstration examples:

- `O` -> Constant
- `O n` -> Linear
- `O n^2` -> Quadratic
- `O n^3` -> Cubic
- `O 2n` -> Exponential
