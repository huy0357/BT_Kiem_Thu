package org.example.bt_tuan_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_normalMixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(8.0, 8.1, 9.5, 7.99, 0.0, 10.0);
        assertEquals(4, analyzer.countExcellentStudents(scores)); // 8.0, 8.1, 9.5, 10.0
    }

    @Test
    public void testCountExcellentStudents_edgeEmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_edgeOnly0or10() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));
    }

    @Test
    public void testCalculateValidAverage_normalMixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // valid: 9.0, 8.5, 7.0 => avg = 24.5/3 = 8.1666...
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // (0 + 10 + 8) / 3 = 6.0
        assertEquals(6.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0, 8.0)), 1e-9);
    }

    @Test
    public void testCalculateValidAverage_edgeEmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 1e-9);
    }

    @Test
    public void testCalculateValidAverage_allInvalidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0, 100.0)), 1e-9);
    }
}
