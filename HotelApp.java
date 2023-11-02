public class HotelApp {
    public static void main(String[] args) {
        FrontDesk hotelService = new FrontDesk();

        hotelService.provideValetService();
        hotelService.provideHouseKeepingService();
        hotelService.provideCartService();
    }
}
