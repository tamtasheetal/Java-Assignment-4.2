package Relationship;

public class Bike {
		// Method Implementation and class Member
		
	private String Color;
	private String maxSpeed;
	public void BikeInfo(String string)

	{
		System.out.println("Bike Color= "+Color+ " MaxSpeed= " +maxSpeed);
	}
	public void setColor(String color)
	{
		this.Color=color;
	}
	public void setMaxSpeed(String maxSpeed) {  
        this.maxSpeed = maxSpeed;  
	}
}
