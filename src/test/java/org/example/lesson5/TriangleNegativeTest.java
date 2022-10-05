package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

class TriangleNegativeTest {
    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    Triangle triangle = new Triangle();

    @ParameterizedTest
    @CsvSource({"0, 7, 7", "-9, 9, 9", "2, 1, 60"})
    void calculateArea(int a, int b, int c) {
        Assertions.assertThrows(IOException.class, () -> {
            triangle.calculateArea(a, b, c);
        });
        logger.error("Это не треугольник");
    }
}