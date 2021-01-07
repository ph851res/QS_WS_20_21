import org.junit.Test;
import static org.junit.Assert.*;

public class MyStringTest {
    private MyString myString;
    private Object anObject;


    @Test
    public void should_Be_Same_Object() {
        this.myString = new MyString("testStringSameObject");
        this.anObject = myString;

        boolean result = anObject.equals(myString);

        assertTrue(result);

        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void should_Be_Different_Type() {
        this.myString = new MyString("testStringWillDiffer");
        this.anObject = "testSrtingWillDiffer";

        boolean result = anObject.equals(myString);

        assertFalse(result);

        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void should_Be_Same_Type() {
        this.myString = new MyString("testStringSameType");
        this.anObject = new MyString("testStringSameType");

        boolean result = anObject.equals(myString);

        assertTrue(result);

        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void should_Be_Same_String() {
        this.myString = new MyString("testStringSameString");
        this.anObject = new MyString("testStringSameString");

        boolean result = anObject.equals(myString);

        assertTrue(result);

        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void should_Be_Different_String() {
        this.myString = new MyString("testStringA");
        this.anObject = new MyString("testStringB");

        boolean result = anObject.equals(myString);

        assertFalse(result);

        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void should_Be_Different_Length() {
        this.myString = new MyString("testStringA");
        this.anObject = new MyString("testStringAB");

        boolean result = anObject.equals(myString);

        assertFalse(result);

        this.myString = null;
        this.anObject = null;
    }
}