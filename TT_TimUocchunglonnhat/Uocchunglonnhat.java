package TT_TimUocchunglonnhat;

import java.util.Scanner;

public class Uocchunglonnhat {
    public static void main(String[] args) {
        //Mục tiêu
        //Luyện tập sử dụng vòng lặp while.
        //
        //Mô tả
        //Trong toán học, nếu số nguyên a chia hết cho số nguyên b thì số b được gọi là ước của số nguyên a, a được gọi là bội của b. Số nguyên dương b lớn nhất là ước của cả hai số nguyên a, b được gọi là ước số chung lớn nhất (ƯCLN) của a và b. Trong trường hợp cả hai số nguyên a và b đều bằng 0 thì chúng không có ƯCLN vì khi đó mọi số tự nhiên khác không đều là ước chung của a và b. Nếu chỉ một trong hai số a hoặc b bằng 0, số kia khác 0 thì ƯCLN của chúng bằng giá trị tuyệt đối của số khác 0.
        //
        //Trong phần này, chúng ta sẽ phát triển một ứng dụng để tìm ước số chung lớn nhất của hai số.
        //
        //Ứng dụng cho phép nhập vào hai số nguyên và hiển thị ước số chung lớn nhất của hai số đó.
        //
        //Các bước thực hiện
        //Bước 1: Khai báo hai biến số nguyên a, b và nhập giá trị cho a, b từ bàn phím
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();

        //Bước 2: Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        //Bước 3: Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        //Bước 4: Tìm ước số chung lớn nhất của a, b
        //Sử dụng vòng lặp kiểm tra trong khi a khác b thì
        //Nếu a < b: a = a – b
        //Còn lại b = b – a
        //Mã nguồn:
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        System.out.println("Greatest common factor: " + a);
    }
}
//trong khi a!=b thi cu thuc hien phep tinh tru (-) den khi nao a=b thi do la uoc chung lon nhat
