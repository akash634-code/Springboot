package test;


	class A
	{
	    void m1()
	    {
	        System.out.println("In m1 A");
	    }
	}
	class B extends A
	{
	    public void m1()
	    {
	        System.out.println("In m1 B");
	    }
	    void m2()
	    {
	        System.out.println("In m2 B");
	    }
	}
	public class Akash {

	    public static void main(String[] args) {
	        A a=new B();
	        a.m1();
	        ((B) a).m2();

	        A b=new A();

	        b.m1();
	        ((B) b).m2(); 
	    }
	}