package testch7_1;

public class Person {
	public String name;
    public int age;
    float speed = 4.0f;

    void setSpeed (float newSpeed) {
        speed = newSpeed;
    }

    float getSpeed () {
        return speed;
    }

    void run () {
        System.out.println(name + " is running at speed " + speed + " feet/s.");
    }
}
