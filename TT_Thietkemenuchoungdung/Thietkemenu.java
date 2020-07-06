package TT_Thietkemenuchoungdung;

import java.util.Scanner;

public class Thietkemenu {
    public static void main(String[] args) {
        //Mục tiêu
        //Luyện tập sử dụng vòng lặp while.
        //Mô tả
        //Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng hiển thị một menu các hình mà ứng dụng có thể vẽ, kèm theo số thứ tự, người dùng chọn một lựa chọn bằng cách nhập và số thứ tự trên menu và ứng dụng sẽ vẽ hình tương ứng.
        //Các bước thực hiện
        //Bước 1: Khai báo biến choice lưu giá trị chọn lựa
        int choice = -1;

        //Bước 2: Tạo đối tượng input thuộc lớp Scanner để nhập liệu
        Scanner input = new Scanner(System.in);

        //Bước 3: Hiển thị thông tin menu gồm 3 lựa chọn
        //Menu
        //Draw the triangle
        //Draw the square
        //Draw the rectangle
        //Exit
        //Enter your choice:
        //Mã nguồn:
        while (choice != 0) {
            System.out.println("Menu ");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangel");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");

            }
        }
    }
}
