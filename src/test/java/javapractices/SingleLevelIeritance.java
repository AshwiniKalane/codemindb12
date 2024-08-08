package javapractices;

public class SingleLevelIeritance {

	public static void main(String[] args) {
		Infosys i= new Infosys();
		System.out.println(i.empNo);
		System.out.println(i.dept);
		i.service();
		
		Bpm b=new Bpm();
		System.out.println(b.name);

	}

}
 class Infosys
 {
	 int empNo=45;
	 String dept="Admin";
	 
	 public void service() {
			System.out.println("infosys is giving many services");
		}

 }
 
 class Bpm extends Infosys
 {
	 String name="Ashwini";
 }
 