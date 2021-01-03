package testch7_1;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "Mateo";
		p1.age = 20;
		p1.speed = 3.5f;

		p2.name = "Danny";
		p2.age = 25;

		System.out.println("p1 is " + p1.name);
		System.out.println("He is " + p1.age + " year old.");
		System.out.println(p1.name + " has speed " + p1.speed + " feet/s.");    
		p1.run();

		System.out.println("\np2 is " + p2.name);
		System.out.println("He is " + p2.age + " year old.");
		System.out.println(p2.name + " has speed " + p2.getSpeed() + " feet/s.");
		p2.run();

		p2.setSpeed(5.0f);
		p2.run();
	}

}
