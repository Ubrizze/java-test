import org.junit.Test;

import com.example.NumberStringUtils;

import static org.junit.Assert.*;

public class NumberStringUtilsTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(NumberStringUtils.isPrime(2));
        assertTrue(NumberStringUtils.isPrime(3));
        assertTrue(NumberStringUtils.isPrime(17));
        assertTrue(NumberStringUtils.isPrime(97));
                
        assertFalse(NumberStringUtils.isPrime(1));
        assertFalse(NumberStringUtils.isPrime(4));
        assertFalse(NumberStringUtils.isPrime(6));
        assertFalse(NumberStringUtils.isPrime(100));
                
        assertFalse(NumberStringUtils.isPrime(0));
        assertFalse(NumberStringUtils.isPrime(-5));
    }
    
    @Test
    public void testIsPalindrome() {        
        assertTrue(NumberStringUtils.isPalindrome("radar"));
        assertTrue(NumberStringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(NumberStringUtils.isPalindrome(""));
        assertTrue(NumberStringUtils.isPalindrome("a"));
                
        assertFalse(NumberStringUtils.isPalindrome("hello"));
        assertFalse(NumberStringUtils.isPalindrome("test"));
                
        assertFalse(NumberStringUtils.isPalindrome(null));
    }
} 
