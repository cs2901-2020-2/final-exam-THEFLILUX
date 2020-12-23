import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacadePatternShapes {

    @Test
    public void Test0(){
        JuegoFacade juegoFacade = new JuegoFacade();

        juegoFacade.elegirPos(0,0,'a');
        juegoFacade.elegirPos(1,0,'b');
        juegoFacade.elegirPos(2,1,'c');
        juegoFacade.elegirPos(3,1,'d');
        juegoFacade.elegirPos(4,0,'e');
        juegoFacade.elegirPos(5,0,'f');
        juegoFacade.elegirPos(6,1,'g');
        juegoFacade.elegirPos(5,1,'h');
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void testTime() throws Exception {
        long startTime = System.currentTimeMillis();
        Test0();
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time <= 2000);
    }
}
