package week3wok;

public class qn6 {
	public static void main(String[] args) {
		lamp Lamp = new lamp();
		
		Lamp.turnOn();
		Lamp.turnOff();
	}
}

class lamp{
	boolean isOn;
	
	void turnOn() {
		isOn = true;
		System.out.println("The Lamp is on: "+ isOn);
	}
	void turnOff() {
		isOn = false;
		System.out.println("The Lamp is off: "+ isOn);
	}
}