import com.largestofthree.LargestOfThree;
import org.junit.Assert;
import org.junit.Test;

public class LargestOfThreeTest {
    LargestOfThree largestOfThree = new LargestOfThree();

    @Test
    public void givenThreeNumber_IfProper_returnFirstMaximum() {
        int result = largestOfThree.getMaximum(15, 10, 3);
        Assert.assertEquals(15, result);
    }

    @Test
    public void givenThreeNumber_IfProper_returnSecondMaximum() {
        int result = largestOfThree.getMaximum(10, 15, 3);
        Assert.assertEquals(15, result);
    }

    @Test
    public void givenThreeNumber_IfProper_returnThirdMaximum() {
        int result = largestOfThree.getMaximum(10, 3, 15);
        Assert.assertEquals(15, result);
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnFirstMaximum() {
        float result= largestOfThree.getMaximum(15.0f,10.0f,3.0f);
        Assert.assertEquals(15.0f,result,0.0);
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnSecondMaximum() {
        float result= largestOfThree.getMaximum(10.0f,15.0f,3.0f);
        Assert.assertEquals(15.0f,result,0.0);
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnThirdMaximum() {
        float result= largestOfThree.getMaximum(3.0f,10.0f,15.0f);
        Assert.assertEquals(15,result,0.0);
    }
    @Test
    public void givenThreeStrings_IfProper_returnFirstMaximum() {
        String result=largestOfThree.getMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenThreeStrings_IfProper_returnSecondMaximum() {
        String result=largestOfThree.getMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenThreeStrings_IfProper_returnThirdtMaximum() {
        String result=largestOfThree.getMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",result);
    }
}