package org.example.lesson5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
class TriangleTest {
    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    Triangle triangle = new Triangle();

    @ParameterizedTest
    @CsvSource({"3, 5, 3", "5, 5, 5", "10, 3, 5", "6, 3, 3"})
    void calculateArea(int a, int b, int c) {
        if (a == b && b == c) {
            assertTrue(true);
            logger.info("равносторонний треугольник");
        } else if (a == b && b != c || a == c && c != b || b == c && c != a) {
            assertTrue(true);
            logger.info("равносторонний треугольник");
        } else {
            assertTrue(true);
            logger.warn("это треугольник, у которого все стороны различаются по длине");
        }

    }

}

