import org.junit.Test;
import static org.junit.Assert.*;

public class MyStringTest {
    private MyString myString;
    private Object anObject;
    private Boolean result;


    @Test
    public void should_Be_Same_Object() {
        this.myString = new MyString("testStringSameObject");
        this.anObject = myString;

        this.result = anObject.equals(myString);

        assertTrue("Should be the same object, return true", result);

        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void should_Be_Different_Type() {
        this.myString = new MyString("testStringWillDiffer");
        this.anObject = new String ("testSrtingWillDiffer");

        this.result = anObject.equals(myString);

        assertFalse("Should not be the same Type, return false", result);

        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void should_Be_Same_Type() {
        this.myString = new MyString("testStringSameType");
        this.anObject = new MyString("testStringSameType");

        this.result = anObject.equals(myString);

        assertTrue("Should be the same Type, return true", result);

        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void should_Be_Same_String() {
        this.myString = new MyString("testStringSameString");
        this.anObject = new MyString("testStringSameString");

        this.result = anObject.equals(myString);

        assertTrue("Should be the same String (and same Type), return true", result);

        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void should_Be_Different_String() {
        this.myString = new MyString("testStringA");
        this.anObject = new MyString("testStringB");

        this.result = anObject.equals(myString);

        assertFalse("The two strings should be different (but same Type), return false", result);

        this.myString = null;
        this.anObject = null;
        this.result = null;
    }
}