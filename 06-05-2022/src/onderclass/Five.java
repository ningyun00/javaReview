package onderclass;

public class Five {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*5.
 ****
 ***
 **
 *
*/