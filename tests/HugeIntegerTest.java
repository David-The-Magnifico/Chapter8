import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {


    @Test
    public  void  test_to_add(){
    HugeInteger integer1 = new HugeInteger();
    HugeInteger integer2 = new HugeInteger();
    integer1.parse("12345678");
    integer2.parse("112345678");
    String result = integer1.add(integer2);
//    System.out.println(Arrays.toString(answer));
    assertEquals("124691356",result);

}@Test
    public  void  test_to_add1(){
    HugeInteger integer1 = new HugeInteger();
    HugeInteger integer2 = new HugeInteger();
    integer1.parse("12345678");
    integer2.parse("12344678");
    String result = integer1.add(integer2);
//    System.out.println(Arrays.toString(answer));
    assertEquals("24690356",result);

}
@Test
    public  void  test_toString(){
        HugeInteger integer = new HugeInteger();
        integer.parse("12345678");
        String expectedString= "12345678";
        assertEquals(expectedString,integer.toString());
}
@Test
public void  test_toSubtract(){
    HugeInteger integer1 = new HugeInteger();
    HugeInteger integer2 = new HugeInteger();
    integer1.parse("22345678");
    integer2.parse("12345679");
    String result = integer1.subtract(integer2);
    assertEquals("9999999",result);

}
}