public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matMiniExam, int fizik,int fizikMiniExam, int kimya,int kimyaMiniExam) {

        if (mat >= 0 && mat <= 100&&matMiniExam >= 0 && matMiniExam <= 100) {
            this.mat.note = mat;
            this.mat.miniExam=matMiniExam;
        }

        if (fizik >= 0 && fizik <= 100&&fizikMiniExam >= 0 && fizikMiniExam <= 100) {
            this.fizik.note = fizik;
            this.fizik.miniExam=fizikMiniExam;
        }

        if (kimya >= 0 && kimya <= 100&&kimyaMiniExam >= 0 && kimyaMiniExam <= 100) {
            this.kimya.note = kimya;
            this.kimya.miniExam=kimyaMiniExam;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double mathAvg=this.mat.note*0.8 +this.mat.miniExam*0.2;
        double fizikAvg=this.fizik.note*0.8 +this.fizik.miniExam*0.2;
        double kimyaAvg=this.kimya.note*0.8 +this.kimya.miniExam*0.2;
        this.avarage = (mathAvg + fizikAvg + kimyaAvg) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlüsü : " + this.mat.miniExam);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlüsü : " + this.fizik.miniExam);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlüsü : " + this.kimya.miniExam);
    }

}