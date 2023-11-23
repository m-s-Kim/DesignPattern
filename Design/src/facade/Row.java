package facade;
//DBMS데이터
public class Row {
	private String name;
	private String birthday;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Row(String name, String birthday, String email) {
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}
	
	
	
}
