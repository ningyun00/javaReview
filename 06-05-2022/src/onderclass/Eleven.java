package onderclass;

public class Eleven {
    public static void main(String[] args) {
        int number = 65;
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print((char) number);
            }
            number++;
            System.out.println();
        }
    }
}
/*11、
     A
    BBB
   CCCCC
  DDDDDDD
 EEEEEEEEE
FFFFFFFFFFF

*/