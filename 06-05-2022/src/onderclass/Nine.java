package onderclass;

public class Nine {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i==2||i==3){
                    if (j==1||j==8){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*9:
 ********
 *      *
 *      *
 *********/