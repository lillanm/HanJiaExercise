package BD.lillanm._arrays;

public class Student {
    private String name;
   private String sex;
   private double scores;

    public Student(String name, String sex, double scores) {
        this.name = name;
        this.sex = sex;
        this.scores = scores;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", scores=" + scores +
                '}';
    }
}
