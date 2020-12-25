package scenario3;

public class Scenario3 {
//create two instance variables with String data types and use their value in static and ---
	//instance methods
	int a;
	String b;
	
	public void m1(){
		a = 2020;
		b = "what is my name";
		System.out.println(b);
	}
    public static void m2(){
    	
    	Scenario3 s3 = new Scenario3();
    	s3.a = 2020;
    	s3.b = "my name is khaled mahmud";
    	System.out.println(s3.b + " " + s3.a);
    }


        public static void main(String[] args) {
			Scenario3 obj = new Scenario3();
			obj.m1();
			m2();
			
		}



}


