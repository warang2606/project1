package basicprogram;

public class StaticVariable 
{
    static int a = 10;
	public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     System.out.println("value of a is :"+a);
	     
	     
	  }
	}
class Student {
int a; //
static int b; //initialized to zero only when class is loaded not for each object created.

  Student(){
   
   b++;
  }

   public void showData(){
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
   }
}



