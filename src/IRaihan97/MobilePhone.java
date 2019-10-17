package IRaihan97;

import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> phonebook;
	public MobilePhone() {
		this.phonebook = new ArrayList<Contact>(); 
	}
	
	public ArrayList<Contact> getPhonebook(){
		return phonebook;
	}
	
	public void addContact(Contact contact) {
		phonebook.add(contact);
	}
	
	public void modifyContact(Contact currentCont, Contact newCont) {
		int position = findItem(currentCont);
        if(position >= 0) {
            modifyContact(position, newCont);
        }
	}
	
	private void modifyContact(int position, Contact newCont) {
        phonebook.set(position, newCont);
        System.out.println("Contact " + (position+1) + " has been modified.");
    }
	
	private int findItem(Contact contact) {
		return phonebook.indexOf(contact);
	}
	
	public void removeContact(Contact contact) {
        int position = findItem(contact);
        if(position >= 0) {
            removeContact(position);
        }
    }
    private void removeContact(int position) {
        phonebook.remove(position);
    }
	
	public boolean onFile(Contact contact) {
        int position = findItem(contact);
        if(position >=0) {
            return true;
        }

        return false;
    }	
}
