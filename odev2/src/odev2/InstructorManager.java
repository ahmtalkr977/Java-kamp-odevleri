package odev2;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli eðitmen sisteme eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli eðitmen sistemden silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstname()+instructor.getLastName()+" isimli eðitmenin bilgileri güncellendi");
	}
	public void createInstruction (Instructor instructor) {
		System.out.println(instructor.getLesson()+" eðitimi oluþturuldu");
	}
	

}
