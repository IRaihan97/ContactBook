package IRaihan97;

import java.util.Scanner;

public class Main {
	private static MobilePhone phone = new MobilePhone();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		boolean again = true;
		while(again) {
			System.out.println();
			inputContact();
			displayBook();
			System.out.print("Would you like to perform another operation?Y/N ");
			String in = input.nextLine();
			in = in.toLowerCase();
			if(in.equals("n")) {
				again = false;
			}
		}
		
	}
	
	public static void modifyContact() {
		System.out.print("Current contact name to modify: ");
        String currentName = input.nextLine();
        System.out.print("Current contact umber to modify: ");
        String currentNumber = input.nextLine();
        
        System.out.print("Enter new Name: ");
        String newName = input.nextLine();
        System.out.print("Enter new number: ");
        String newNumber = input.nextLine();
        phone.modifyContact(new Contact(currentName, currentNumber), new Contact(newName, newNumber));
	}
	
	private static void inputContact() {
		System.out.println("Insert Name: ");
		String name = input.nextLine();
		System.out.println("Insert Number: ");
		String number = input.nextLine();
		phone.addContact(new Contact(name, number));
	}

	private static void displayBook() {
		System.out.println("You have " + phone.getPhonebook().size() + " contact in your phonebook");
		System.out.println("Displaying full contact list: ");
        for(int i=0; i< phone.getPhonebook().size(); i++) {
            System.out.println((i+1) + ". Name:" + phone.getPhonebook().get(i).getName() + ", Number:" + phone.getPhonebook().get(i).getNumber());
        }
	}
	
}
