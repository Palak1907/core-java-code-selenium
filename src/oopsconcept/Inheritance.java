package oopsconcept;

/*Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. 
Inherit a new class called C from A, and create a member of class B inside C. 
Do not create a constructor for C. Create an object of class C and observe the results.
*/
class A{
	public A() 
	{
		System.out.println("Class A constructor");	
	}
}

class B{
	int a =20;
	public B() 
	{
		System.out.println("Class B constructor");
	}
}

class C extends A{
	B b = new B();
	
	}
public class Inheritance {

	public static void main(String[] args) {
		
		C Cobj= new C();
		
	}

}
