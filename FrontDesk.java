public class FrontDesk {
    private HotelService valetService = new Valet();
    private HotelService houseKeepingService = new HouseKeeping();
    private HotelService cartService = new Cart();

    public void provideValetService() {
        valetService.provideService();
    }

    public void provideHouseKeepingService() {
        houseKeepingService.provideService();
    }

    public void provideCartService() {
        cartService.provideService();
    }
}
