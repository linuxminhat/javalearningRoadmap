package chuong1;

public class b60 {
    // Hàm kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không
    public static boolean checkingGreater(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkingGreater(123)); // true
        System.out.println(checkingGreater(321)); // false
        System.out.println(checkingGreater(1359)); // true
    }
}