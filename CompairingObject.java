package classes;

public class CompairingObject 
{
	public int age;
	public String name;
	public long phno;
	public String email;
	public CompairingObject(int age,String name,long phno,String email)
	{
		this.age=age;
		this.name=name;
		this.phno=phno;
		this.email=email;
	}
	public static void main(String[] args) 
	{
		CompairingObject obj1=new CompairingObject(22,"mouli",9492779196l,"moulirajkumar143@gmail.com");
		CompairingObject obj2=new CompairingObject(22,"mouli",9492779196l,"moulirajkumar143@gmail.com");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
	}
}

