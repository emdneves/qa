import org.PL01_02.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

@Test
public void testIsPalindrome(){
    assertEquals(true, StringUtils.isPalindrome("ana"));
    assertTrue(StringUtils.isPalindrome("Ana"));

    assertEquals(false, StringUtils.isPalindrome("123"));
    assertFalse(StringUtils.isPalindrome(null));
    assertFalse(StringUtils.isPalindrome("Ãna"));

    }
}

/*
    @Test
    public void testIsPalindrome(){
        String palindrome = "level";
        boolean result = StringUtils.isPalindrome(palindrome); //testa a função isPalindrome da classe com a palavra level.
        assertTrue(result, "É Palindrome"); //passa no teste se retornar True
    }

    @Test
    public void testNonPalindrome(){
        String nonPalindrome = "level";
        boolean result = StringUtils.isPalindrome(nonPalindrome); //testa a função isPalindrome da classe com a palavra level.
        assertFalse(result, "Não é Palindrome"); //passa no teste se retornar True
    }
    @Test
    public void testIsPalindrome_numeros(){
        String palindrome = "";
    }
*/



