public class Person {
    private int age;
    private String name;
    private String surname;
    private boolean gender;

    public Person(int age, String name, String surname, boolean gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setId(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
          this.gender = gender;
    }

    @Override
    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return   "Hi, I am " + name + " " + surname + ", a " + age + " years old, " + genderString + ".";
    }
}
