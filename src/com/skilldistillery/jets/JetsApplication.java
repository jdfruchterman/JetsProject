package com.skilldistillery.jets;

import java.util.Scanner;


// this class contains the main, which runs the jetsApp. this instantiates a new airfield, then prints out menu options
// and uses a switch to select the various options (using methods from airfield) or quit. to keep scanner in just one field,
// all methods using scanner are in here.
public class JetsApplication {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.run();
	}

	public void run() {

		AirField campJimmy = new AirField();

//		Jet[] allJets = campJimmy.getJets();

		System.out.println("**************************\n");
		System.out.println("Welcome to Camp Jimmy AFB!\n");
		System.out.println("**************************\n");
		int option = 0;
		while (true) {
			System.out.println("\nPlease choose from the following list of options:\n");
			System.out.println("1. List Fleet \n2. Fly all jets \n3. View fastest jet \n4. View jet with longest range"
					+ "\n5. Load all cargo jets \n6. Dogfight! \n7. Add a jet to the Fleet \n8. Quit");
			option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				campJimmy.printJets();
				break;
			case 2:
				campJimmy.flyAllJets();
				break;
			case 3:
				campJimmy.printFastestJet();
				break;
			case 4:
				campJimmy.printJetWithLongestRange();
				break;
			case 5:
				campJimmy.loadAllCargoJets();
				break;
			case 6:
				campJimmy.dogfight();
				break;
			case 7:
				addJetToField(campJimmy);
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Error");
			}
		}

	}

	public void addJetToField(AirField airfield) {
		System.out.println("Please enter the model of aircraft you would like to add to the field: ");
		String model = scanner.nextLine();
		System.out.println("Please enter the cruising speed of the aircraft in MPH: ");
		double speed = scanner.nextDouble();
		System.out.println("Please enter the range of the aircraft: ");
		int range = scanner.nextInt();
		System.out.println("Please enter the price of the aircraft: ");
		long price = scanner.nextLong();
		System.out.println("Thank you! Your " + model + " has been added to the field at Camp Jimmy AFB");

		Jet newJet = new JetImpl(model, speed, range, price);
		airfield.addJet(newJet);
	}

}
