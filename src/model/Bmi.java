package model;

public class Bmi {
    private double height;
    private double weight;
    private int id;
    private double bmi;

    public Bmi(double height, double weight, int id, double bmi) {
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.bmi = bmi;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Waga: ")
                .append(this.getWeight())
                .append("| Wzrost: ")
                .append(this.height)
                .append("| Id customer: ")
                .append(this.id)
                .append("| BMI: ")
                .append(this.bmi);
        return sb.toString();
    }
}

