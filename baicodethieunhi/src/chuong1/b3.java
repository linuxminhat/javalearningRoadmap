package chuong1;

import java.math.BigDecimal;

public class b3 {
    // Tính tổng từ 1/1 -> 1/n
    public static BigDecimal calSum(BigDecimal n) {
        BigDecimal sum = BigDecimal.ZERO; // Khởi tạo sum
        BigDecimal one = BigDecimal.ONE;  // Giá trị 1 để chia

        for(int i = 1; i <= n.intValue(); i++) {
            BigDecimal iBigDecimal = BigDecimal.valueOf(i);
            sum = sum.add(one.divide(iBigDecimal, 10, BigDecimal.ROUND_HALF_UP)); // Chia và làm tròn
        }
        return sum;
    }

    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(5);
        System.out.println(calSum(n)); // Chuyển số nguyên thành BigDecimal
    }
}
