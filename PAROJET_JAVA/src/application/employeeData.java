
package application;

import java.sql.Date;


public class employeeData {
    
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNum;
    private String position;
    private String image;
    private Date date;
    private Double salary;
    
    public employeeData(Integer employeeId, String firstName, String lastName, String gender, String phoneNum, String position, String image, Date date){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.position = position;
        this.image = image;
        this.date = date;
    }
    public employeeData(Integer employeeId, String firstName, String lastName,String position, Double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }
    
    public Integer getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }    
    public String getPosition(){
        return position;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    public Double getSalary(){
        return salary;
    }
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
    
}
