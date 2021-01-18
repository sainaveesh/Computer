package org.phone;

public class InternalStorage {

	public void processorName() {
//<<<<<<< HEAD
 System.out.println("Before Conflicts");
//=======
		


	}

	public void ramSize() {
		// TODO Auto-generated method stub
		System.out.println("8GB");
	}

	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();

		i.ramSize();
		i.processorName();
		e.size();
	}
}
