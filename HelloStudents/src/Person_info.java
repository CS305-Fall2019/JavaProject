
public class Person_info {
private String fname;
private String familyname;
private int age;
public double netSalary;
public PhoneNumber data = new PhoneNumber();
//End:Refactoring example to extract class
public String getPhoneNumber() {
	return data.officeAreacode+"-"+data.officeNumber;
	}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getFamilyname() {
	return familyname;
}
public void setFamilyname(String familyname) {
	this.familyname = familyname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public double getNetSalary() {
	return netSalary;
}
//Start:Refactoring example to parameterize method
public void setNetSalary(double s, double r) {
	this.netSalary = s+s*r;
}

//End:Refactoring example to parameterize method
@Override
public String toString() {
	return "Person [fname=" + fname + ", familyname=" + familyname + ", age=" + age + ", netSalary=" + netSalary + "]";
}
public void publicMethod() {
	System.out.println("Pull me out to superclass");
}
}
