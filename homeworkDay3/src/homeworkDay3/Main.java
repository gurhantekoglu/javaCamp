package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "engin123", "I1",
				"DevArchitecture, Instructor and Lifetime Learner");

		Instructor instructor2 = new Instructor(2, "Kerem", "Varış", "keremvaris@gmail.com", "kerem456", "I2",
				"DevArchitecture Community Leader");

		Student student1 = new Student(1, "Gürhan", "Tekoğlu", "gurhantekoglu@gmail.com", "gurhan123", "S1", "3");
		Student student2 = new Student(2, "Berkan", "Çelik", "berkancelik@gmail.com", "berkan456", "S2", "4");
		Student student3 = new Student(3, "Doğuş", "Tuluk", "dogustuluk@gmail.com", "dogus789", "S3", "5");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.updateAbout(instructor2);

		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(student1);
		studentManager.totalWatchedCourse(student2);

		UserManager userManager = new UserManager();
		Student[] students = { student1, student2, student3 };
		userManager.listStudent(students);
		Instructor[] instructors = { instructor1, instructor2 };
		userManager.listInstructor(instructors);

	}

}
