package testch7_1;

public class main2 {

	public static void main(String[] args) {
		ExampleStatic.staticMethod();
		ExampleStatic object = new ExampleStatic();
		object.nonStaticMethod();
		object.finalMethod();
	}

}
