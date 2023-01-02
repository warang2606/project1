//all types of variable
package basicprogram;

class Subject
{
	int javamarks = 78;  //instance variable
	int cmarks = 99;
	 static String sub = "python"; 
	void displaymarks()
	{
		System.out.println("javamarks are:"+javamarks);
		System.out.println("cmarks are:"+cmarks);
	}
}
public class InstanceVariable 
{
	public void displayage()
	{
		int age = 56;  //local variable
		age = age+10;
		System.out.println("age is:"+age);
		
		int dob = 23;
		System.out.println("date of birth is:"+dob);
	}
	

	public static void main(String[] args) 
	{
		InstanceVariable h = new InstanceVariable();
		h.displayage();
		
		Subject s = new Subject();
		//s.javamarks = 67;
		//s.cmarks = 89;
	    System.out.println("subject name:"+Subject.sub);   //access the static variable not need to create the object
		s.displaymarks();

	}

}
