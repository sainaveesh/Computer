package org.phone;

public class Phone {
public void phoneInfo(double price) {
	System.out.println("Price of the Mobile "+price);

}
public void mam() {
	System.out.println("Love u Mamatha");
}
public void phoneInfo(String cam,long num) {
	System.out.println("Camera pixels of the mobile "+cam);
	System.out.println("Mobile number is "+num);
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo(25000.243);
	//p.phoneInfo("8GB");
	p.mam();
	p.phoneInfo("25MP",9966711437l);
}
}
