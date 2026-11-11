package DEMO;

import java.time.LocalDate;

public class User {
    private Long id;
    private  String sex;
    private LocalDate birthday;
    private  String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(Long id, String sex, LocalDate birthday, String name) {
        this.id = id;
        this.sex = sex;
        this.birthday = birthday;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
