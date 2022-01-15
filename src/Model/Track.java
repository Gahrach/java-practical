package Model;

public class Track extends Vehicle {
    private String purpose;
    private int weight;
    private Passanger passanger;

    public Track(String type){
        super(type);
    }

    public Track(String brand, String purpose,int weight){
        super(brand);
        this.purpose = purpose;
        this.weight = weight;

    }
    public String toString(){
        return "Track: " +
                ", brand-'" + getBrand() + '\''+
                ", type-'" + getType() + '\''+
                ", year-'" + getYear() + '\''+
                ", purpose-'" + purpose + '\''+
                ", weight-'" + weight + '\'' ;
    }


    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    public void speed(){
        System.out.println(120);
    }

    {
        System.out.println("-------------------------TRACK-------------------------");
    }

}
