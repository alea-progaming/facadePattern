public class Valet implements HotelService{
    private HotelService hotelService;
    @Override
    public void provideService() {
        pickUpVehicle("AUS873");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Pick up for valet service. Plate number: " + plateNumber);
    }

}   
