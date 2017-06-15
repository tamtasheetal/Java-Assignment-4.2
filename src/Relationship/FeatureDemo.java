package Relationship;
//FeatureDemo class is making object of Pulsar class and initialized it.

public class FeatureDemo 
{
	public static void main(String[] args)
	{
//The Pulsar Class does not have setColor(), setMaxSpeed() and BikeInfo() 
//methods, still we can use it due to IS-A relationship of Pulsar class with Bike class.
		Pulsar myPulsar = new Pulsar();
		myPulsar.setColor("Blue");
		myPulsar.setMaxSpeed("170");
		myPulsar.BikeInfo("The Pulsar RS200 made for Races");
		myPulsar.PulsarStartDemo();

	}

}
