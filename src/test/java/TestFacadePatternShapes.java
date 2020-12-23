import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacadePatternShapes {

    @Test
    public void Test0(){
        JuegoFacade juegoFacade = new JuegoFacade();

        //juegoFacade.elegirPos(1,3,'a');
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void testTime() throws Exception {
        long startTime = System.currentTimeMillis();
        //generic(0);
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time <= 2000);
    }
}
