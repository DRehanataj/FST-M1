package activities;

public class Car {

	String Color;
	String transmission;
	int make;
	int tyres;
	int doors;
	Car(String Color,String transmission,int make){
		this.Color=Color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=4;
		this.doors=4;
	}
	
	public  void displayCharacteristics(){
		System.out.println("Colour:"+ Color);
		System.out.println("Transmission type:"+transmission);
		System.out.println("Year of making:"+make);
		System.out.println("No of tyres:"+tyres);
		System.out.println("No of doors:" +doors);
	}
	public void accelerator() {
		System.out.println("Car is moving fast");
	}
	public void brake() {
		System.out.println("Car is moving stopped");
	}
	
	}

