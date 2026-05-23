package structural.decorator;

import java.util.Scanner;

import structural.decorator.base.Car;
import structural.decorator.base.FordEcoSport;
import structural.decorator.base.FordEndeaver;
import structural.decorator.base.FordFigo;
import structural.decorator.decorator.Insurance;
import structural.decorator.decorator.SeatCover;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true){
			Car car = null;
			System.out.println("Press 1 for Ford Ecosport");
			System.out.println("Press 2 for Ford Figo");
			System.out.println("Press 3 for Ford Endeaver");
			int baseCar = scanner.nextInt();

			switch (baseCar) {
				case 1:
					car = new FordEcoSport();
					break;
				case 2:
					car = new FordFigo();
					break;
				case 3:
					car = new FordEndeaver();
					break;
				default:
					System.out.println("Please select a valid number");
					break;
			}

			System.out.println("Add-On: Seat Cover -> press y or n)");
			String seatCover = scanner.next();
			if(seatCover.equalsIgnoreCase("Y")){
				car = new SeatCover(car);
			}
			System.out.println("Add-On: Car Insurance -> press y or n");
			String carInsurance = scanner.next();
			if(carInsurance.equalsIgnoreCase("Y")){
				car = new Insurance(car);
			}
			System.out.println("=========================");
			System.out.println(" Final Cost: "+ car.cost());
			System.out.println("=========================");
		}
	}
}
