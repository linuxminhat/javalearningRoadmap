package chuong3;
public class RectanglePattern {
    public static void main(String[] args) {
        int m = 5; // Số hàng (chiều cao của hình chữ nhật)
        int n = 7; // Số cột (chiều rộng của hình chữ nhật)

        // Vòng lặp in từng hàng của hình chữ nhật
        for (int i = 0; i < m; i++) {
            // Vòng lặp in từng cột của hình chữ nhật
            for (int j = 0; j < n; j++) {
                // In ký tự '*' để tạo hình chữ nhật đặc
                System.out.print("*");
            }
            // Xuống dòng sau khi in xong mỗi hàng
            System.out.println();//cứ in còn lại xuống dòng sau 
        }
    }
}