package err;

import java.util.Objects;

public class GirlFriend {

    private String name;
    private int age;

    public GirlFriend() {

    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameFormatException {
        if(name.length() > 10 || name.length() < 3){
            throw new NameFormatException(name + "长度不能超过10个同时不能少于3个！");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeFormatException {
        if(age < 18 || age > 40){
            throw new AgeFormatException(age + "不能超过40岁，不能小于18岁！å");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GirlFriend that = (GirlFriend) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
