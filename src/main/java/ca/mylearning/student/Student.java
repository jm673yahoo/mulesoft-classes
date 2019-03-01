package ca.mylearning.student;
import java.math.BigDecimal;

public class Student {
	private long id;
    private String firstName;
    private String lastName;
    private BigDecimal dob;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getDob() {
		return dob;
	}
	public void setDob(BigDecimal dob) {
		this.dob = dob;
	}
    
    
}
