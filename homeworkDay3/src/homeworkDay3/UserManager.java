package homeworkDay3;

public class UserManager {
	public void listInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("E�itmenin Ad� ve Soyad�: " + instructor.getFirstName() + instructor.getLastName() + "\n"
					+ "E�itmenin E-posta Adresi: " + instructor.getEmail() + "\n" + "E�itmen Hakk�nda: "
					+ instructor.getAbout() + "\n");
		}
	}

	public void listStudent(Student[] students) {
		for (Student student : students) {
			System.out.println("��rencinin Ad� ve Soyad�: " + student.getFirstName() + student.getLastName() + "\n"
					+ "��rencinin E-posta Adresi: " + student.getEmail() + "\n"
					+ "��rencinin Kursu Toplam �zleme S�resi (Saat): " + student.getTotalWatchTimeCourse() + "\n");
		}
	}

}
