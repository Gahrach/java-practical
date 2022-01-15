package Model;

public class Trailer extends Track {
    private int length;

    public Trailer(String type, String purpose, int length){
        super(type,purpose,length);
        this.length = length;

    }
    public void setLength(Integer length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    @Override
    public void speed(){
        System.out.println("200");
    }
    @Override
    public String toString() {
        return "Trailer: " +
                ", brand-'" + getBrand() + '\'' +
                ", type-'" + getType() + '\'' +
                ", year-'" + getYear() + '\'' +
                ", purpose-'" + getPurpose() + '\'' +
                ", weight-'" + getWeight() + '\'' +
                ", length-'" + getLength() + '\'';

    }

    {
        System.out.println("--------------------TRAILEEEEER--------------------");
    }
    }




