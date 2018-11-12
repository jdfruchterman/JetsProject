package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.run();
	}

	public void run() {

		AirField campJimmy = new AirField();

		Jet[] allJets = campJimmy.getJets();

//		addJetToField(campJimmy);
		int option = 0;
		while (true) {
			System.out.println("Welcome to Camp Jimmy AFB!");
			System.out.println("Please choose from the following list of options:");
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

//		campJimmy.printJets();
//		campJimmy.flyAllJets();
//		campJimmy.printFastestJet();
//		campJimmy.printJetWithLongestRange();
//		
//		campJimmy.loadAllCargoJets();

//		campJimmy.dogfight();

		// Make menu printout change to pick menu option

		// scanner to take user input
		// if one of menu options, call method
		//
		// if != one of menu options, "error", return to menu

		//

		// TEST New plane process
//		Jet newJet = new JetImpl("Fighty Mc Fast Face", 100000, 55000, 1000);

		// read input

//		newJet.setName();

		// read speed from user
		// set speed

//		FighterJet testerJet = new FighterJet("Fighty Mc Fast Face", 100000, 55000, 1000);

//		campJimmy.addJet(testerJet);
		// prints all jet models
		
		
//		for (Jet jet : allJets) {
//			if (jet != null) {
//				System.out.println(jet.getModel());
//			} else
//				break;
//		}
//		for (Jet jet : allJets) {
//			if (jet != null && jet.getClass()) {
//			System.out.println(jet.getModel());
//			}
//			else break;
//		}
	}

	public void addJetToField(AirField airfield) {
		System.out.println("Please enter the model of aircraft you would like to add to the field: ");
		String model = scanner.nextLine();
		System.out.println("Please enter the cruising speed of the aircraft: ");
		double speed = scanner.nextDouble();
		System.out.println("Please enter the range of the aircraft: ");
		int range = scanner.nextInt();
		System.out.println("Please enter the price of the aircraft: ");
		long price = scanner.nextLong();
		System.out.println("Thank you! Your " + model + " has been added to the field at Camp Jimmy AFB");

		Jet newJet = new JetImpl(model, speed, range, price);
		airfield.addJet(newJet);
	}

//	public void menu() {
//		// sysout menu
////		Airfield airfield = new Airfield();
//		int option = scanner.nextInt();
//		if (option > 0 && option < 9) {
//			switch (option) {
//			case 1:
//				airfield.printJets();
//				continue;
//			case 2:
//				airfield.flyAllJets();
//				continue;
//			case 3:
//				campJimmy.printFastestJet();
//				continue;
//			case 4:
//				campJimmy.printJetWithLongestRange();
//				continue;
//			case 5:
//				campJimmy.loadAllCargoJets();
//				continue;
//			case 6:
//				campJimmy.dogfight();
//				continue;
//			case 7:
//				addJetToField(campJimmy);
//				continue;
//			case 8:
//				System.exit(8);
//			}
//		} else
//			System.out.println("Error");
//	}
}
