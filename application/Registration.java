package application;

public class Registration 
{
	private String name;
	private String email;
	private long phoneNo;
	private String password;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public Registration(String name,String emailId,String password,long phoneNo)
	{
		this.name=name;
		this.email=emailId;
		this.password=password;
		this.phoneNo=phoneNo;
	}
	
}
