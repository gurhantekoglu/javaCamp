package homeworkDay3;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()
				+ " adlý eðitmen yeni bir kurs ekledi." + "\n");
	}

	public void updateAbout(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " adlý eðitmen 'Hakkýnda' alanýný " + "'"
						+ instructor.getAbout() + "'" + " þeklinde güncelledi." + "\n");
	}

}
