package algorithms.searching_sorting.models;

public class Car {
	
	private String name;
	private Double price;
	
	public Car() {
		super();
	}
	
	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Car[] mockCars() {
		Car cars[] = {
				new Car("Lamborghine", 1000000d),
				new Car("Jipe", 46000d),
				new Car("Brasília", 16000d),
				new Car("Smart", 46000d),
				new Car("Fusca", 17000d),
				new Car("Ferrari", 1230000d),
				new Car("Corsa", 15000d),
		};
		return cars;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
