package odev2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ahmet");
		student.setLastName("Alkur");
		student.setEmail("ahmet@mail.com");
		student.setMyLesson("Java");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstname("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@mail.com");
		student.setMyLesson("Java");
		
		
		OperationsUI operationsUI1 = new OperationsUI();
		operationsUI1.add( new StudentManager(), student,new  FileLogger());
		operationsUI1.update(new StudentManager(), student, new FileLogger());
		operationsUI1.delete(new StudentManager(), student, new FileLogger());
		
		System.out.println("*************************");
		
		operationsUI1.add(new InstructorManager(), instructor, new EmailLogger());
		operationsUI1.update(new InstructorManager(), instructor, new EmailLogger());
		operationsUI1.delete(new InstructorManager(), instructor, new EmailLogger());
		
		
		

	}

}
