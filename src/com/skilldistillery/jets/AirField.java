package com.skilldistillery.jets;

public class AirField {
	private Jet[] jets = new Jet[MAX_JETS];
//	private int numJets = 0;

	private final static int MAX_JETS = 100;

	public AirField() {
		populateJets();
	}

	public void populateJets() {

		jets[0] = new JetImpl("Boeing 707", 607.0, 3600, 4_300_00);
		jets[1] = new FighterJet("F-22", 1220, 1600, 150_000_000);
		jets[2] = new JetImpl("Airbus A380", 561, 8000, 445_000_000);
		jets[3] = new CargoPlane("Lockheed C-5 Galaxy", 518, 5500, 223_000_000);
		jets[4] = new JetImpl("Cessna Citation Hemisphere", 685, 4500, 35_000_000);

	}

	public void addJet(Jet j) {
		for (int i = 0; i < MAX_JETS; i++) {
			if (jets[i] == null) {
				jets[i] = j;
				break;
			}
		}
	}

//	public Jet[] getJets() {
//		return this.jets;
//	}

	public void printJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet);
			}

		}
	}

	public void dogfight() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				jet.fly();
			}
		}

	}

	public void printFastestJet() {
		Jet fastJet = jets[0];
		for (int i = 1; i < jets.length; i++) {
			Jet jet = jets[i];
			if (jet != null) {
				if (jet.getSpeed() > fastJet.getSpeed()) {
					fastJet = jet;
				}
			}
		}
		System.out.println("The fastest Jet is the " + fastJet.getModel() + ", with a speed of " + fastJet.getSpeed());

	}

	public void printJetWithLongestRange() {
		Jet longJet = jets[0];
		for (int i = 1; i < jets.length; i++) {
			Jet jet = jets[i];
			if (jet != null) {
				if (jet.getRange() > longJet.getRange()) {
					longJet = jet;
				}
			}
		}
		System.out.println("The Jet with the longest range is the " + longJet.getModel() + ", with a range of "
				+ longJet.getRange());

	}
}
