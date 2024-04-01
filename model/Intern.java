package model;

public class Intern implements Employee {
    private double stipend;

    public Intern(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}