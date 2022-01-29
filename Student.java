package classes;

public class Student {
	Course mat;
	Course fizik;
	Course kimya;
	Course oralMat;
	Course oralFzk;
	Course oralKmy;
	String name;
	String stuNo;
	int classes;
	double avarage;
	boolean isPass;

	Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya, Course oralMat,
			Course oralFzk, Course oralKmy) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.oralMat = oralMat;
		this.oralFzk = oralFzk;
		this.oralKmy = oralKmy;
		calcAvarage();
		this.isPass = false;
	}

	void addBulkExamNote(int mat, int fizik, int kimya, int oralMat, int oralFzk, int oralKmy) {

		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		}
		if (oralMat >= 0 && oralMat <= 100) {
			this.oralMat.note = oralMat;
		}
		if (oralFzk >= 0 && oralFzk <= 100) {
			this.oralFzk.note = oralFzk;
		}
		if (oralKmy >= 0 && oralKmy <= 100) {
			this.oralKmy.note = oralKmy;
		}
	}

	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiþ");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.avarage);
			if (this.isPass) {
				System.out.println("Sýnýfý Geçti");
			} else {
				System.out.println("Sýnýfta Kaldý");
			}
		}
	}

	public void calcAvarage() {
		this.avarage = (((this.fizik.note * 0.8) + (this.oralFzk.note * 0.2))
				+ ((this.kimya.note * 0.8) + (this.oralKmy.note * 0.2))
				+ ((this.mat.note * 0.8) + (this.oralMat.note * 0.2))) / 3;
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println("====================");
		System.out.println("Öðrenci: " + this.name);
		System.out.println("Matematik Notu: " + this.mat.note);
		System.out.println("Matematik Sözlü Notu: " + this.oralMat.note);
		System.out.println("Fizik Notu: " + this.fizik.note);
		System.out.println("Fizik Sözlü Notu: " + this.oralFzk.note);
		System.out.println("Kimya Notu: " + this.kimya.note);
		System.out.println("Kimya Sözlü Notu: " + this.oralKmy.note);
	}

}
