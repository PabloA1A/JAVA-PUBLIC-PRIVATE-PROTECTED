package dev.pablo;

public class Professor {
    private String name;
    private int age;
    private int yearsConsolidated;

    public Professor(String name, int age, int yearsConsolidated) {
        this.name = name;
        this.age = age;
        this.yearsConsolidated = yearsConsolidated;
    }

    public int getYearsConsolidated() {
        return yearsConsolidated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}