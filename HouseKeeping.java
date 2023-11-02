public class HouseKeeping implements HotelService {

    @Override
    public void provideService() {
        cleanRoom(123);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service for room number " + roomNumber);
    }
}
