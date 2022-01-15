package Service;
import Model.*;


public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Mercedes","sedan", 2020 );
        System.out.println(car.getBrand());
        System.out.println(car.getType());
        System.out.println(car.getYear());
        car.setYear(2018);
        System.out.println(car.getYear());
        Track track = new Track("Man","construction",20);
        track.speed();
        System.out.println(track.getBrand());
        System.out.println(track.getPurpose());
        System.out.println(track.getWeight() + " tonns");
        Trailer trailer = new Trailer("ref","transportation",15);
        trailer.speed();
        System.out.println(trailer.getPurpose());
        System.out.println(trailer.getLength());
        System.out.println(trailer.getType());  // xia null????????????????
        System.out.println(track);
        System.out.println(trailer);         //  brand-ref -a tpum ?,     xi chi tpum modulneri mejiny ?
        Passanger passanger = new Passanger(25,"high school");
        System.out.println(passanger.getEducation());
        System.out.println(passanger);
        Engineer engineer = new Engineer(30,"bachelor",11);
        System.out.println(engineer.getAge());
        System.out.println(engineer);

        Engineer engineer1 = new Engineer(30,"bachelor",11);
        engineer1.setAge(32);
        System.out.println(engineer.equals(engineer1));     // ete equals-y override exac chlini stuguma hascenery
                                                          // ete override exaca tpuma parunakutyuny

        Passanger passanger1 = new Passanger(25,"high school");
        System.out.println(passanger1.equals(passanger));               // ete equals-y override arac chlini ktpi false



    }
}
