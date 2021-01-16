package org.phone;

public class Desktop1 implements HardWare,Software {

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardwareResources");
	}
public static void main(String[] args) {
	Desktop1 d=new Desktop1();
	d.softwareResources();
	d.hardwareResources();
}
}
