package onclass;

public class One {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("遇到第"+(i+1)+"个美女:");
            for (int j = 0; j < 3; j++) {
                System.out.println("美女,有男朋友吗?");
            }
        }
    }
}
/*1. 小明每次遇到一个美女都要问3句: 美女,有男朋友吗? 今天小明居然遇到了10个美女. 用嵌套循环来体现小明今天的生活
输出格式:
遇到第1个美女:
	美女,有男朋友吗?
	美女,有男朋友吗?
	美女,有男朋友吗?
遇到第2个美女:
	美女,有男朋友吗?
	美女,有男朋友吗?
	美女,有男朋友吗?
遇到第3个美女:
	美女,有男朋友吗?
	美女,有男朋友吗?
	美女,有男朋友吗?
....
*/