
public class Person {
private String name;
private String lastName;
private String mobile;



public Person() {
	// TODO Auto-generated constructor stub
}
/***
 * 
 * @param name String
 * @param lastName String
 * @param mobile String
 */
public Person(String name, String lastName, String mobile) {
	
	setName(name);
	setLastName(lastName);
	setMobile(mobile);
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Person [name=" + name + ", lastName=" + lastName + ", mobile=" + mobile + "]";
}




	

}
