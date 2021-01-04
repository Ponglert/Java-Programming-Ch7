package testch7_1;

public class Person2 {
	private String id;
	protected String name;
	protected int age;
	public String sex;

    public Person2 () {
    }

    public Person2 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce () {
        System.out.println("My name is " + name);
    }
}
