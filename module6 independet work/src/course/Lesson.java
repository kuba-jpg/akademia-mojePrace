package course;

public class Lesson {

	public static void main(String[] args) {

		int shampooNeeded = 10;	//bottles
		int soapNeeded = 10;		//bars
		int detergentNeeded = 10; 	//packges
		
		int shampooExpected = 4; 	//bottles
		int soapExpected = 5;		//bars
		int detergentExpected =6;	//packges
		
		
		
		if (shampooNeeded > 0) {
			int shampoo =  shampooNeeded - shampooExpected;
			System.out.println("SZAMPON.");
			System.out.println("Potrzebujesz " + shampooNeeded + ", brakuje ci " + shampooExpected);
			System.out.println("wiêc masz: " + shampoo + " butelek");
		}
		else if (shampooExpected == 0) {
			int shampoo = (shampooNeeded);
			System.out.print("SZAMPON.");
			System.out.println("Potrzebujesz " + shampooNeeded + ", nic ci nie brakuje ");
			System.out.println("wiêc masz: " + shampoo + " butelek");
		
		}
		else {
			System.out.println("ERROR");
		}
		
		
		
		
		boolean holidays = false;
		
		
		
		
		if (holidays && soapNeeded > 0) {
			int soap = (soapNeeded/2)- soapExpected;
			System.out.println("MYD£O.");
			System.out.println("Potrzebujesz " + (soapNeeded/2) + ", brakuje ci " + soapExpected);
			System.out.println("wiêc masz: " + soap + " kostek");
		}
		else if (soapNeeded > 0) {
			int soap =  soapNeeded - soapExpected;
			System.out.println("MYD£O.");
			System.out.println("Potrzebujesz " + soapNeeded + ", brakuje ci " + soapExpected);
			System.out.println("wiêc masz: " + soap + " kostek");
		}
		else if (soapExpected == 0) {
			int soap = soapNeeded;
			System.out.println("MYD£O.");
			System.out.println("Potrzebujesz " + soapNeeded + ", nie brakuje ci nic ");
			System.out.println("wiêc masz: " + soap + " kostek");
		}
		else {
			System.out.println("ERROR");
		}
			

		
		
		
		if (holidays && detergentNeeded > 0) {
			int detergent = (detergentNeeded/2)- detergentExpected;
			System.out.println("PROSZEK DO PRANIA.");
			System.out.println("Potrzebujesz " + (detergentNeeded/2) + ", brakuje ci " + detergentExpected);
			System.out.println("wiêc masz: " + detergent + " opakowañ");
		}
		else if (detergentNeeded > 0) {
			int detergent =  detergentNeeded - detergentExpected;
			System.out.println("PROSZEK DO PRANIA.");
			System.out.println("Potrzebujesz " + detergentNeeded + ", brakuje ci " + detergentExpected);
			System.out.println("wiêc masz: " + detergent + " opakowañ");
		}
		else if (soapExpected == 0) {
			int detergent = detergentNeeded;
			System.out.println("PROSZEK DO PRANIA.");
			System.out.println("Potrzebujesz " + detergentNeeded + ", nie brakuje ci nic ");
			System.out.println("wiêc masz: " + detergent + " opakowañ");
		}
		else {
			System.out.println("ERROR");

		}

	}

}
