package extend;

public abstract class Person {
    private String name;
    private int age;
    private String sex;

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
