package javapractices;

public class MultiLevelInheritance {

	public static void main(String[] args) {
	Car c=new Car();
	System.out.println(c.modelNum);
	System.out.println(c.color);
	
	c.Running();
	
	BMW b=new BMW();
	System.out.println(b.Showroom);
	
	Audy a= new Audy();
	System.out.println(a.SerialNo);
	
	
	
	

	}

}

class Car
{
	 
	 String modelNum ="M12679869F";
	 String color= "Black";
	 
	 public void Running() {
			System.out.println("Car is running fast");
		}

}

class BMW extends Car
{
	 String Showroom="Pune";
}


class Audy extends Car
{
	
	String SerialNo="NSD123";
}