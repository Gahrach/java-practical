package Model;

public class Vehicle {

    private String brand;
    private String type;
    private int year;



    public Vehicle(String brand){
         this.brand = brand;
}

    public Vehicle(String brand, String type, int year) {
        this.brand = brand;
        this.type = type;
        this.year = year;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        if (year > 2000) {
            this.year = year;
        } else {
            System.out.println("not necessary");

        }
    }

    public int getYear() {
        return year;

    }
     public void setType(String type){
        this.type = type;
}
     public String getType(){
        return type;
}


    {
        System.out.println("------------------------VEHICLE----------------------");
    }

}