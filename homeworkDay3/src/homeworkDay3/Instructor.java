package homeworkDay3;

public class Instructor extends User {
	private String instructorCode;
	private String about;

	public Instructor(int id, String firstName, String lastName, String email, String password, String instructorCode,
			String about) {
		super(id, firstName, lastName, email, password);
		this.instructorCode = instructorCode;
		this.about = about;
	}

	public Instructor() {

	}

	public String getInstructorCode() {
		return instructorCode;
	}

	public void setInstructorCode(String instructorCode) {
		this.instructorCode = instructorCode;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
