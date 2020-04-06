# Java Algorithms - Searching and Sorting

Implementation of search and ordering algorithms.

## Index :pushpin:

- [Searching Algorithms](#searching)
- [Sorting Algorithms](#sorting)

## Searching Algorithms <a name="searching"></a>:heart:

#### Search Default

- Descriptions in progress...

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

## Sorting Algorithms <a name="sorting"></a>:heart:

- in progress...