import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ProgramTest {
  
    public class testIsPrime {

      @Test
      public void testIsPrime_IsValidPrime_ReturnTrue() {
        //Arrange
    
        //Act
        boolean IsPrime = Program.IsPrime(7);
    
        //Assert
        assertTrue(IsPrime);
      }

      @Test
      public void IsPrime_ZeroValue_ReturnFalse() {
    
        //Arrange
    
        //Act
        boolean IsPrime = Program.IsPrime(0);
        //Assert
        assertFalse(IsPrime);
      }

      @Test
      public void IsPrime_NotValidPrime_ReturnFalse() {
    
        //Arrange
    
        //Act
        boolean IsPrime = Program.IsPrime(10);
        //Assert
        assertFalse(IsPrime);
      }
      
      @Test
      public void IsPrime_IsNumber9_ReturnFalse() {
      
        //Arrange
      
        //Act
        boolean IsPrime = Program.IsPrime(9);
        //Assert
        assertFalse(IsPrime);
      }

      @Test(expected = NullPointerException.class)
      public void testSpecial() {
        //Arrange

        //Act
        Program.Special(0);
        //Assrt
        assertThrows(NullPointerException.class, () -> Program.Special(2023));
      }
    }
  }