package onclass;

public class Three {
    public static void main(String[] args) {
        for (int i = 0; i <7 ; i++) {
//            System.out.println("*");
            for (int j = 7; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*3、输出如下图形:
 *******
 ******
 *****
 ****
 ***
 **
 *

 *
 ***
 *****
 *******
 *********
 */