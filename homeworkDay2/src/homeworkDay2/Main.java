package homeworkDay2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs", "Engin Demirog", "�cretsiz");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demirog",
				"�cretsiz");
		Course course3 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog",
				"�cretsiz");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName);
		}

		Category category1 = new Category(1, "Programlama");

		Category[] categories = { category1 };

		for (Category category : categories) {
			System.out.println(category.name);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.joinTheProgram(course1);

		courseManager.joinTheProgram(course2);

		courseManager.joinTheProgram(course3);

		courseManager.searchTheCourse(course3);

	}

}
