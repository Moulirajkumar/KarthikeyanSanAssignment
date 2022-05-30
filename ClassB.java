package classes;

public class ClassB 
{
	public void meth()
	{
		System.out.println("This is ClassB method");
	}
	public static void main(String[] args) 
	{
		ClassA obj=new ClassA();
		obj.meth();
	}
}
