package javaOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# yaz�l�mc� geli�tirme kursu","Engin Demiro�");
		Course course2 = new Course(2,"Java yaz�l�mc� geli�tirme kursu","Engin Demiro�");
		Course course3 = new Course(3,"Programlamaya giri� i�in temel kurs","Engin Demiro�");
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println("Kursun ad�: "+course.courseName);
			System.out.println("Kursun e�itmeni: "+course.instructor);
			System.out.println("------------------------------------");
			
			
		}
		
		
		CourseManager coureManager = new CourseManager();
		coureManager.registerCourse(course1);
		coureManager.registerCourse(course2);
		coureManager.registerCourse(course3);

	}

}
