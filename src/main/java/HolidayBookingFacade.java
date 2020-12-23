public class HolidayBookingFacade {
    FlightBooking flightBooking;
    HotelBooking hotelBooking;
    CabBooking cabBooking;

    public HolidayBookingFacade(){
        flightBooking = new FlightBooking();
        hotelBooking = new HotelBooking();
        cabBooking = new CabBooking();
    }

    public void bookHolidayPakage(){
        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        cabBooking.bookCab();
    }

}
