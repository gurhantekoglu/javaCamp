package homeworkDay3;

public class StudentManager {
	public void registerCourse(Student student) {
		System.out.println(
				student.getFirstName() + " " + student.getLastName() + " adl� ��renci kursa kay�t oldu." + "\n");
	}

	public void totalWatchedCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� ��renci kursu toplamda "
				+ student.getTotalWatchTimeCourse() + " saat izledi." + "\n");
	}
}
