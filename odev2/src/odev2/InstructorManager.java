package odev2;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli e�itmen sisteme eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli e�itmen sistemden silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli e�itmenin bilgileri g�ncellendi");
	}
	public void createInstruction (Instructor instructor) {
		System.out.println(instructor.getLesson()+" e�itimi olu�turuldu");
	}
	

}
