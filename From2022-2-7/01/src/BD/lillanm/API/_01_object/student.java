package BD.lillanm.API._01_object;

import java.util.Objects;

public class student {
    private String name;
    private String sex;
    private int age;


    public student() {
    }

    public student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//如果两个对象是同一个对象，则直接返回true
        if (o == null || getClass() != o.getClass()) return false;//是空，或者两个类不属于同一个类，直接返回false
        student student = (student) o;//过滤到这一层已经是了，转化为student的形式，开始对比内容
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
        //用object类的equals方法比字符串的equals方法更加安全
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}
