package Model;

import java.util.Objects;

public class Engineer extends Passanger {
    private int experience;
    public Engineer(int age,String education,int experience){
        super(age, education);
        this.experience = experience;
    }
    @Override
    public String toString(){
        return "Engineer : " +
                " age- " + getAge() + '\'' +
                ", education- " + getEducation() + '\'' +
                ", experience- " + experience + '\'';
    }
    {
        System.out.println("----------------ENGINEER----------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return experience == engineer.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience);
    }
}
