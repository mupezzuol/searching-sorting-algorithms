# Java Algorithms - Searching and Sorting

Implementation of search and ordering algorithms.

## Index :pushpin:

- [Searching Algorithms](#searching)
- [Sorting Algorithms](#sorting)

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

- in progress...

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
