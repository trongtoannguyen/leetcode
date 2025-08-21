package tymex.itw;

public class Student {
    private String id;
    private Integer age;
    public Student(String id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }
}
