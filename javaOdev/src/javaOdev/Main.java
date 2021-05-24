package javaOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# yazılımcı geliştirme kursu","Engin Demiroğ");
		Course course2 = new Course(2,"Java yazılımcı geliştirme kursu","Engin Demiroğ");
		Course course3 = new Course(3,"Programlamaya giriş için temel kurs","Engin Demiroğ");
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println("Kursun adı: "+course.courseName);
			System.out.println("Kursun eğitmeni: "+course.instructor);
			System.out.println("------------------------------------");
			
			
		}
		
		
		CourseManager coureManager = new CourseManager();
		coureManager.registerCourse(course1);
		coureManager.registerCourse(course2);
		coureManager.registerCourse(course3);

	}

}
