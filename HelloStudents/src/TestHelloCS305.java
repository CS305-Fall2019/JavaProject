
public class TestHelloCS305 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=10, b=15;
   int c=a+b;
   System.out.println(c);
   gender student1=new gender();
// Start:Refactoring example to extract method  
   setData(student1);
   // End:Refactoring example to extract method
   System.out.println(student1.getFname());

   double s=1000, r=0.15;
  
       student1.setNetSalary(s,r);
  
   System.out.println(student1);
   if (student1.getNetSalary()>1500)
	   System.out.println("higher ");
   else
	   System.out.println("lower ");
   
   studentAction(student1);
   }

	private static Boolean studentAction(gender student1) {
		if (student1.getAge()>20 && student1.getStatus()=="single")
		   {
			   
			 return true; 
		   }
		return false;
	}


	private static void setData(gender student1) {
		student1.setStatus("Single");    
		   student1.setFname("Davy");
		   student1.setAge(19);
		   student1.setFamilyname("Jones");
	}

}
