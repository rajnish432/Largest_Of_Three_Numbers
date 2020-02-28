import com.largestofthree.LargestOfThree;
import org.junit.Assert;
import org.junit.Test;


public class LargestOfThreeTest {

    @Test
    public void givenThreeNumber_IfProper_returnFirstMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(15,10,3);
        Assert.assertEquals(15, largestOfThree.getMaximum());
    }


    @Test
    public void givenThreeNumber_IfProper_returnSecondMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(10,15,3);
        Assert.assertEquals(15, largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeNumber_IfProper_returnThirdMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(10,3,15);
        Assert.assertEquals(15, largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnFirstMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(15.0f,10.0f,3.0f);
        Assert.assertEquals(15.0f, largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnSecondMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(10.0f,15.0f,3.0f);
        Assert.assertEquals(15.0f, largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeFloatValues_IfProper_returnThirdMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree(10.0f,3.0f,15.0f);
        Assert.assertEquals(15.0f, largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeStrings_IfProper_returnFirstMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree("Peach","Apple","Banana");
        Assert.assertEquals("Peach", largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeStrings_IfProper_returnSecondMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree("Apple","Peach","Banana");
        Assert.assertEquals("Peach", largestOfThree.getMaximum());
    }

    @Test
    public void givenThreeStrings_IfProper_returnThirdtMaximum() {
        LargestOfThree largestOfThree = new LargestOfThree("Apple","Banana","Peach");
        Assert.assertEquals("Peach", largestOfThree.getMaximum());
    }

    @Test
    public void givenFiveElements_IfProper_ReturnMaxValue() {
        LargestOfThree largestOfThree=new LargestOfThree();
        Assert.assertEquals(60,largestOfThree.getMaximum(15,12,3,4,5,60,26));
    }
}