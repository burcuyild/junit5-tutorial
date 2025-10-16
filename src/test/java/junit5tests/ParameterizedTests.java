package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    @DisplayName("US123 - TC12 - this method is the parameterized")
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
//    @NullSource
//    @EmptySource
    @NullAndEmptySource
    @ValueSource(strings = {"a", "b", "c"})
    void stringValues(String theParam){
        System.out.println("theParam = " + theParam);
    }
}
