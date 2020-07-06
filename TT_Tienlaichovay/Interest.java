package TT_Tienlaichovay;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        //Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
        //Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay. Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
        //Cách tính tiền lãi:
        //Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể rút ra sau một khoảng thời gian nhất định người gửi tiền đã cam kết với ngân hàng. Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo tuần, tháng, quý, năm.
        //Công thức:
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;

        //Bước 2: Tạo đối tượng input thuộc lớp Scanner để thực hiện nhập liệu dữ liệu cho 3 biến đã khai báo.
        //Scanner input = new Scanner(System.in);
        //Bước 3: Nhập giá trị cho các biến
        //Nhập số tiền gửi
        // System.out.println("Enter investment amount: ");
        // money = input.nextDouble();
        //Nhập số tháng gửi
        // System.out.println("Enter number of months: ");
        // month = input.nextInt();
        //Nhập lãi suất
        // System.out.println("Enter annual interest rate in percentage: ");
        // interset_rate = input.nextDouble();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate (%): ");
        interest_rate = input.nextDouble();

        //Bước 4: Tính lãi suất nhận được sau 3 thang
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interest_rate/100)/12 * month;
        }

        //Bước 5: In ra lãi suất
        System.out.println("Totla of interest: " + total_interest);



    }
}
