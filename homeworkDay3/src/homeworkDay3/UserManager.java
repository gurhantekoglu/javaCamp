package homeworkDay3;

public class UserManager {
	public void listInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Eðitmenin Adý ve Soyadý: " + instructor.getFirstName() + instructor.getLastName() + "\n"
					+ "Eðitmenin E-posta Adresi: " + instructor.getEmail() + "\n" + "Eðitmen Hakkýnda: "
					+ instructor.getAbout() + "\n");
		}
	}

	public void listStudent(Student[] students) {
		for (Student student : students) {
			System.out.println("Öðrencinin Adý ve Soyadý: " + student.getFirstName() + student.getLastName() + "\n"
					+ "Öðrencinin E-posta Adresi: " + student.getEmail() + "\n"
					+ "Öðrencinin Kursu Toplam Ýzleme Süresi (Saat): " + student.getTotalWatchTimeCourse() + "\n");
		}
	}

}
