package scenario4;

public class Scenario4 {
    
	static int x;
	static String y;
	
	public void p1(){
		x = 100;
		y ="where do you live";
		System.out.println(y + " "+ x +"%.");
	}
	
	public static void p2(){
		Scenario4 s4 = new Scenario4();
		x = 100;
		y = "I live in woodbridge virginia";
		System.out.println(y + " " +x+"%?");
		
		
	}
	public static void main(String[] args) {
		Scenario4 object = new Scenario4();
		object.p1();
		p2();
	}

}
