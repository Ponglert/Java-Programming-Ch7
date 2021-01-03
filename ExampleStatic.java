package testch7_1;

public class ExampleStatic {
	private  int nonStaticVariable;
	private  static int staticVariable;

    public static void staticMethod() {   
         staticVariable = 9999;
         System.out.println("Set StaticVariable = " + staticVariable);
    }
    public void nonStaticMethod() {
         nonStaticVariable = 999;
         staticVariable = 9998;
         System.out.println("Set nonStaticVariable = " + nonStaticVariable);
         System.out.println("Set staticVariable = " + staticVariable);
    }
}
