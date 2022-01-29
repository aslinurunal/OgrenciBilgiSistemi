package classes;

public class Main {
	public static void main(String[] args) {

		Course mat = new Course("Matematik", "Mat101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");

		Course oralMat = new Course("Matematik S�zl�s�", "Mat101", "MAT");
		Course oralFzk = new Course("Fizik S�zl�s�", "FZK101", "FZK");
		Course oralKmy = new Course("Kimya S�zl�s�", "KMY101", "KMY");

		Teacher t1 = new Teacher("Murat Torun", "1111", "MAT");
		Teacher t2 = new Teacher("G�khan Ero�lu", "2222", "FZK");
		Teacher t3 = new Teacher("�zlem Orhan", "3333", "KMY");

		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);

		Student s1 = new Student("K�bra Tun�", "111222", 4, mat, fizik, kimya, oralMat, oralFzk, oralKmy);
		s1.addBulkExamNote(50, 20, 40, 30, 60, 90);
		s1.isPass();

		Student s2 = new Student("Kaan Y�lmaz", "222333", 4, mat, fizik, kimya, oralMat, oralFzk, oralKmy);
		s2.addBulkExamNote(100, 50, 40, 70, 70, 70);
		s2.isPass();

		Student s3 = new Student("Emine G�ney", "333444", 4, mat, fizik, kimya, oralMat, oralFzk, oralKmy);
		s3.addBulkExamNote(50, 20, 40, 50, 45, 60);
		s3.isPass();
	}

}
