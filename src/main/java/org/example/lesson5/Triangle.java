package org.example.lesson5;

import java.io.IOException;

public class Triangle {
    public double calculateArea(int a, int b, int c) throws IOException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IOException("это не треугольник");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IOException("это не треугольник");
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;

    }


}
