
public class gender extends Person_info{
 private String status;

public String getStatus() {
	return status;
}


@Override
public String toString() {
	return "gender [status=" + status + ", netSalary=" + netSalary + ", officeAreacode=" + data.officeAreacode
			+ ", officeNumber=" + data.officeNumber + "]";
}


public void setStatus(String status) {
	this.status = status;
}


public void pushmedown() {
}
}
