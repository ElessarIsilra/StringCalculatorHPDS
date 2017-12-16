import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCalculate {

    @BeforeTest
    public void init(){
        Calculator calculator = new Calculator();
    }
    public void EmptyReturnsZero() throws Exception {
        Assert.assertEquals(Calculator.calculate(""),0);
    }
    public void LoneNumberReturnsHisValue() throws Exception {
        Assert.assertEquals(Calculator.calculate("7"),7);

    }
    public void LoneNumberReturnsHisValue2() throws Exception {
        Assert.assertEquals(Calculator.calculate("134"),134);

    }
    public void TwoNumbersSeparatedByComaReturnsTheirSum() throws Exception {
        Assert.assertEquals(Calculator.calculate("7,3"),10);

    }
    public void TwoNumbersSeparatedByNewlineReturnsTheirSum() throws Exception {
        Assert.assertEquals(Calculator.calculate("7\n3"),10);

    }
    public void ThreeNumbersSeparatedByComaReturnsTheirSum() throws Exception {
        Assert.assertEquals(Calculator.calculate("7,3,10"),20);

    }
    public void ThreeNumbersSeparatedByNewlineReturnsTheirSum() throws Exception {
        Assert.assertEquals(Calculator.calculate("7\n3\n10"),20);

    }
    public void ThreeNumbersSeparatedByNewlineOrComaReturnsTheirSum() throws Exception {
        Assert.assertEquals(Calculator.calculate("7\n3,10"),20);

    }
    public void LoneNumberGreaterThan1000IsIgnored() throws Exception {
        Assert.assertEquals(Calculator.calculate("1001"),0);

    }
    public void NumbersSeparatedByComaGreaterThan1000AreIgnored() throws Exception {
        Assert.assertEquals(Calculator.calculate("1,2,1001"),3);

    }
    public void NumbersSeparatedByNewlineGreaterThan1000AreIgnored() throws Exception {
        Assert.assertEquals(Calculator.calculate("1\n2\n1001"),3);

    }
    public void NumbersSeparatedByNewlineOrComaGreaterThan1000AreIgnored() throws Exception {
        Assert.assertEquals(Calculator.calculate("1\n2,4\n1001"),7);

    }
    @Test(expectedExceptions = Exception.class)
    public void NegativeNumbersReturnsExceptions() throws Exception {
        Calculator.calculate("-1");
    }
}
