public class Account {
    private String name;
    private Integer age;
    private Character sex;

    public Account(String name, Integer age, Character sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String verifySex() {
        if (this.sex == 'F') {
            return "is female";
        } else if (this.sex == 'M') {
            return "is male";
        } else {
            return  "unknown";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex
                ;
    }
}
