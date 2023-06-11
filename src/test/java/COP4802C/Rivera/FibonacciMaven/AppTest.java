package COP4802C.Rivera.FibonacciMaven;
//Reference: https://junit.org/junit5/docs/current/user-guide/#overview


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, App.sequence(0));
        assertEquals(1, App.sequence(1));
        assertEquals(1, App.sequence(2));
        assertEquals(2, App.sequence(3));
        assertEquals(3, App.sequence(4));
        assertEquals(5, App.sequence(5));
        assertEquals(8, App.sequence(6));
        assertEquals(13, App.sequence(7));
        assertEquals(21, App.sequence(8));
        assertEquals(1836311903, App.sequence(46));
        assertEquals(2971215073L, App.sequence(47));
        //Long data type required to exceed integer range, value known to create issue
        //Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    }
}