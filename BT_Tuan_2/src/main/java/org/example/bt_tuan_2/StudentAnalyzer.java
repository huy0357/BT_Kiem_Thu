package org.example.bt_tuan_2;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double s : scores) {
            if (s == null) continue;
            if (s < 0 || s > 10) continue;    // validate
            if (s >= 8.0) count++;
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     * - Bỏ qua điểm <0 hoặc >10
     * - Nếu không có điểm hợp lệ (hoặc danh sách rỗng/null) => trả về 0.0
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0.0;

        double sum = 0.0;
        int validCount = 0;

        for (Double s : scores) {
            if (s == null) continue;
            if (s < 0 || s > 10) continue;
            sum += s;
            validCount++;
        }

        if (validCount == 0) return 0.0;
        return sum / validCount;
    }
}
