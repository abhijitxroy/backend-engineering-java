package structural.decorator.decorator;

import structural.decorator.base.Car;

public abstract class CarDecorator extends Car{
	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}
	
}
