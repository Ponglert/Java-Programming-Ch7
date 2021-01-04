package testch7_1;

public class Car implements ICar {
	int gear = 0;

    public void engineStart() {
    	System.out.println("start engine");
    }
    public void changeGear(int newGear) {
    	System.out.println("assign new gear");
    }
    public void turnLeft() {
    	System.out.println("turn car to left direction");
    }
    public void turnRight() {
    	System.out.println("turn car to left direction");
    }
}
