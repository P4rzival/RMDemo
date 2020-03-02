import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTester {
    @Test
    public void firstTest()
    {
        assertEquals(false,Prime.isPrime(1));
    }

    @Test
    public void secondTest()
    {
        assertEquals(true,Prime.isPrime(2));
    }

    @Test
    public void thirdTest()
    {
        assertEquals(true,Prime.isPrime(3));
    }

    @Test
    public void zeroTest()
    {
        assertEquals(false,Prime.isPrime(0));
    }

    @Test
    public void negTest()
    {
        assertEquals(false,Prime.isPrime(-54));
    }

    @Test
    public void fourTest()
    {
        assertEquals(false,Prime.isPrime(4));
    }

    @Test
    public void fiveTest()
    {
        assertEquals(true,Prime.isPrime(5));
    }

    @Test
    public void sixTest()
    {
        assertEquals(false,Prime.isPrime(6));
    }

    @Test
    public void nineTest()
    {
        assertEquals(false,Prime.isPrime(9));
    }

    @Test
    public void bigTest()
    {
        assertEquals(false,Prime.isPrime(17*23));
    }

    @Test
    public void big2Test()
    {
        assertEquals(true,Prime.isPrime(101));
    }
}
