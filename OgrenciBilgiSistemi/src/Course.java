public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int miniExam;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int miniExam=0;
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.teacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}
