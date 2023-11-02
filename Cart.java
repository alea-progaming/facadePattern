public class Cart implements HotelService{

    @Override
    public void provideService() {
        requestCart(2);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Request for luggage cart. Number of cart/s: " + numberOfCarts);
    }
}
