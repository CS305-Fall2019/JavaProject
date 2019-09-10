
public class gender extends Person{
 private String status;

public String getStatus() {
	return status;
}


@Override
public String toString() {
	return "gender [status=" + status + ", netSalary=" + netSalary + ", officeAreacode=" + officeAreacode
			+ ", officeNumber=" + officeNumber + "]";
}


public void setStatus(String status) {
	this.status = status;
}
}
