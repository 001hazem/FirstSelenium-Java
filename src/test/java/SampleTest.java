import org.testng.annotations.DataProvider;
import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @DataProvider (name = "Factroal data provider")
    public Object[][] dpMethod() {

        return new Object [][] {{3,6},{5,120}};

    }

    @Test(priority = 2)
    public void test1 ()
    {
        int x=5 , y = 6;
        Assert.assertTrue(x != y);
    }


    @Test(dataProvider = "Factroal data provider")
    public void TestFactorial (int input , int output){
        Factorial factorial =new Factorial() ;
        Assert.assertEquals(factorial.Fact(input),output);
    }

    @Test(priority = 3)
    public void test2()
    {
        int x=5 , y=6;
        Assert.assertFalse(x == y);
    }


}
