package analyzingTemperatureData;

import arrayCalculator.ArrayCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureAnalyzerTest {

    private TemperatureAnalyzer analyzer;

    @BeforeEach
    public void setUp() {
        this.analyzer = new TemperatureAnalyzer();
    }

    @ParameterizedTest()
    @MethodSource
    public void givenArray_whenGetMaxPeriod_returnMaxPeriod(double[] array, int minimumTemperature, int result) {
        assertEquals(result, this.analyzer.getMaxPeriod(array, minimumTemperature));
    }

    static Stream<Arguments> givenArray_whenGetMaxPeriod_returnMaxPeriod() {
        return Stream.of(
                Arguments.of(new double[]{20.8, 22.2, 23.5, 21.3, 19.2, 18.0, 20.7, 22.3, 23.3, 23.5, 24.5, 22.6, 21.9}, 22, 5),
                Arguments.of(new double[]{24, 22, 23, 22, 24, 25, 26, 22, 23, 23, 24, 22, 23}, 22, 13),
                Arguments.of(new double[]{20, 21, 19, 18, 19, 18, 19, 20, 18}, 22, 0),
                Arguments.of(new double[]{23, 21, 19, 18, 19, 18, 19, 20, 18}, 22, 1),
                Arguments.of(new double[]{19, 21, 19, 18, 19, 18, 19, 20, 23}, 22, 1),
                Arguments.of(new double[]{23, 21, 22, 18, 19, 23, 24, 18, 24, 23, 18}, 22, 2),
                Arguments.of(new double[]{23, 24, 22, 18, 19, 23, 24, 18, 24, 23, 22, 22, 23}, 22, 5),
                Arguments.of(new double[]{23, 24, 22, 18, 19, 23, 24, 18, 24, 23, 18, 22, 22, 18, 23}, 22, 3)
        );
    }
}
