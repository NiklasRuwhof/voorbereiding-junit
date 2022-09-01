import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {


    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }


    @Test
    void executeWithValidIntReturnsFizz(){

        var testValue = sut.execute(3);

        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithValidIntReturnsBuzz(){

        var testValue = sut.execute(5);

        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithValidIntReturnsFizzBuzz(){

        var testValue = sut.execute(15);

        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
