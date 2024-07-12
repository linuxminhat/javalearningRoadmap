package chuong1;


public class b43 {
    // Đếm số lượng chữ số của số n
    public static int countingNumber(int number) {
        int count = 0;
        while (number > 0) {
//            int digit = number % 10; // 5 -> 4 -> 7 -> 1
            count += 1; // Tăng số lượng chữ số lên 1
            number /= 10; // Loại bỏ chữ số cuối cùng của number
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingNumber(1745)); // Kết quả mong đợi là 4
    }
}
