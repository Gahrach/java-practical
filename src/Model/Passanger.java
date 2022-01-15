package Model;

import java.util.Objects;

public class Passanger {
    private int age;
    private String education;

    public Passanger(int age,String education){

        this.age = age;
        this.education = education;

    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setEducation(String age){
        this.education = education;
    }
    public String getEducation(){
        return education;
    }


    public String toString(){
        return "Passanger: '" +
                "age - '" + age + '\'' +
                ", education- '" + education + '\'';

    }

    {
        System.out.println("--------------PASSANGER---------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passanger passanger = (Passanger) o;
        return age == passanger.age && Objects.equals(education, passanger.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, education);
    }
}
