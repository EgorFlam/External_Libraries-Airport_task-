import com.skillbox.airport.Airport;


public class Main {

    public static void main(String[] args) {
        Airport airport = Airport.getInstance(); //список моделей самолетов

        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().size());
    }
}
