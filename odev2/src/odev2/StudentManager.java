package odev2;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Sisteme "+student.getFirstName()+student.getLastName()+" isimli ��renci eklendi");
	}
	public void delete(Student student) {
		System.out.println("Sistemdeki "+student.getFirstName()+student.getLastName()+" isimi ��renci silindi");
	}
	public void update (Student student) {
		System.out.println("Sistemde bulunan "+student.getFirstName()+student.getLastName()+" isimli ��rencinin bilgileri g�ncellendi");
	}
	public void selectLesson(Student student) {
		System.out.println("Se�ilen ders :"+student.getMyLesson());
	}

}
