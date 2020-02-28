import com.largestofthree.LargestOfThree;
import org.junit.Assert;
import org.junit.Test;

public class LargestOfThreeTest {
    LargestOfThree largestOfThree=new LargestOfThree();
    @Test
    public  void givenThreeNumber_IfProper_returnFirstMaximum() {
        int result=largestOfThree.getMaximum(15,10,3);
        Assert.assertEquals(15,result);
    }

    @Test
    public void givenThreeNumber_IfProper_returnSecondMaximum() {
        int result=largestOfThree.getMaximum(10,15,3);
        Assert.assertEquals(15,result);
    }

    @Test
    public void givenThreeNumber_IfProper_returnThirdMaximum() {
        int result=largestOfThree.getMaximum(10,3,15);
        Assert.assertEquals(15,result);

    }
}
