package dmit2015.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BMITest{

    @ParameterizedTest(name = "Weight={0}, height={1}, expectedBMI = {2}")
    @CsvSource({
            "100,66,16.1",
            "140,66,22.6",

}
            void BMI_ReturnsCorrectResults(int weight, int height, double BMI) {
// Arrange

        BMI BMI1 = new BMI1();
// Act
        BMI1.weight(weight);
        BMI1.height(height);
// Assert
        assertEquals(expectedBMI, BMI1.BMI, 0.005);
    }