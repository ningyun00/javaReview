package onclass;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要打印多少行");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*2.  手动输入一个行数, 程序自动打印该行数的星星, 每行星星个数为8个
 ********
 ********
 ********
 ********
 ********
 ********
 *********/
