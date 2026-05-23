package structural.decorator.decorator;

import structural.decorator.base.Car;

public class Insurance extends CarDecorator {
	public Insurance(Car car) {
		super(car);
	}

	private final double insurancePrice = 15000.00;

	@Override
	public double cost() {
		return car.cost() + insurancePrice;
	}
}
