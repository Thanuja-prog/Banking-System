package user;

public class User {
	private int userID;
	private String name;
	public User(int userID,String name) {
		this.userID=userID;
		this.name=name;
	}
	public void displayUser()
	{
		System.out.println(userID);
		System.out.println(name);
	}
	public String getName() {
	return name;
	}
}