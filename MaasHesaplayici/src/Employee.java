public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(salary>1000){
           return salary*0.03;
        }else
            return 0;
    }
    public double bonus(){
        if (workHours>40){
           int shift=workHours-40;
           return shift*30;
        }else
            return 0;
    }
    public double raiseSalary(){
        int result=2021-hireYear;
        if(result<10){
            return salary*0.05;
        } else if (result>9 && result<20) {
            return salary*0.10;
        }else {
            return salary*0.15;
        }
    }

    public String toString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi:  "+this.tax());
        System.out.println("Bonus:  "+this.bonus());
        System.out.println("Maaş Artışı:  "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş:  "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam Maaş: "+(this.salary+this.bonus()+this.raiseSalary()-this.tax()));

        return null;
    }
}

