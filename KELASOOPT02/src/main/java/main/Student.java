package main;

public class Student {
    private String name;
    private double kat;
    private double uts;
    private double uas;

    public Student(String name) {
        this.name = name;
    }

    public double getNa(){
        return 0.5*kat+0.25*uts+0.25*uas;
    }

    public Student(String name, double kat, double uts, double uas) {
        this.name = name;
        this.kat = kat;
        this.uts = uts;
        this.uas = uas;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKat() {
        return kat;
    }

    public void setKat(double kat) {
        this.kat = kat;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }


}
