import org.testng.annotations.Test;

public class TestFacadePatternShapes {

    @Test
    public void Test0(){
        HolidayBookingFacade holidayBookingFacade = new HolidayBookingFacade();
        holidayBookingFacade.bookHolidayPakage();
    }
}
