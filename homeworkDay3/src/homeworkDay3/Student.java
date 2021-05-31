package homeworkDay3;

public class Student extends User {
	private String studentCode;
	private String totalWatchTimeCourse;

	public Student(int id, String firstName, String lastName, String email, String password, String studentCode,
			String totalWatchTimeCourse) {
		super(id, firstName, lastName, email, password);
		this.studentCode = studentCode;
		this.totalWatchTimeCourse = totalWatchTimeCourse;
	}

	public Student() {

	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getTotalWatchTimeCourse() {
		return totalWatchTimeCourse;
	}

	public void setTotalWatchTimeCourse(String totalWatchTimeCourse) {
		this.totalWatchTimeCourse = totalWatchTimeCourse;
	}

}
