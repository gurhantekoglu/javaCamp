package homeworkDay3;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()
				+ " adl� e�itmen yeni bir kurs ekledi." + "\n");
	}

	public void updateAbout(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " adl� e�itmen 'Hakk�nda' alan�n� " + "'"
						+ instructor.getAbout() + "'" + " �eklinde g�ncelledi." + "\n");
	}

}
