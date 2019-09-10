
public class Person {
private String fname;
private String familyname;
private int age;
public double netSalary;
//Start:Refactoring example to extract class
public String officeAreacode;
public String officeNumber;
//End:Refactoring example to extract class
public String getPhoneNumber() {
	return officeAreacode+"-"+officeNumber;
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
public void setNetSalary10(double s) {
	this.netSalary = s+s*0.10;
}
public void setNetSalary15(double s) {
	this.netSalary = s+s*0.10;
}
//End:Refactoring example to parameterize method
@Override
public String toString() {
	return "Person [fname=" + fname + ", familyname=" + familyname + ", age=" + age + ", netSalary=" + netSalary + "]";
}
}