package assignment;

public class FullyEncapsulatedClass2 {

	public static void main(String[] args) {
		AccessPrivteMem a=new AccessPrivteMem();
		a.setname("Ashwini Bhosale");
		System.out.println(a.getname());
		
		a.setage(30);
		System.out.println(a.getage());
		
		System.out.println("her name is "+a.getname() + " and her age will be "+ a.getage());
		

	}

}

class AccessPrivteMem
{
	private String name="Ashwini Kalane";
	private int age = 29;
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public float getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}



	
}


