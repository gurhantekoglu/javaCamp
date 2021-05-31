package homeworkDay3;

public class StudentManager {
	public void registerCourse(Student student) {
		System.out.println(
				student.getFirstName() + " " + student.getLastName() + " adlý öðrenci kursa kayýt oldu." + "\n");
	}

	public void totalWatchedCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlý öðrenci kursu toplamda "
				+ student.getTotalWatchTimeCourse() + " saat izledi." + "\n");
	}
}
