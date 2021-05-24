package odev2;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Sisteme "+student.getFirstName()+student.getLastName()+" isimli öğrenci eklendi");
	}
	public void delete(Student student) {
		System.out.println("Sistemdeki "+student.getFirstName()+student.getLastName()+" isimi öğrenci silindi");
	}
	public void update (Student student) {
		System.out.println("Sistemde bulunan "+student.getFirstName()+student.getLastName()+" isimli öğrencinin bilgileri güncellendi");
	}
	public void selectLesson(Student student) {
		System.out.println("Seçilen ders :"+student.getMyLesson());
	}

}
