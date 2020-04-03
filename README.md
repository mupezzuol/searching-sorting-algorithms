# Java Algorithms

Implementation of search and ordering algorithms.

## Index :pushpin:

- [Searching Algorithms](#searchingAlgorithms)
- [Sorting Algorithms](#sortingAlgorithms)

## Searching Algorithms <a name="searchingAlgorithms"></a>:heart:

- Search Default
```java
public int searchDefault(Car[] cars, int beginPosition, int endPosition) {
	int cheaper = beginPosition;
	for (int current = beginPosition; current <= endPosition; current++) {
		if (cars[current].getPrice() < cars[cheaper].getPrice()) {
			cheaper = current;
		}
	}
	return cheaper;
}
```

## Sorting Algorithms <a name="searchingAlgorithms"></a>:heart:

- in progress...