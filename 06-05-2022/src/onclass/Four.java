package onclass;

public class Four {
    public static void main(String[] args) {
        int iceCreamPrice = 2/*冰淇淋单价*/, drumstickPrice = 3/*鸡腿单价*/, iceCreamNumber = 0/*冰淇淋个数*/, drumstickNumber = 0/*鸡腿个数*/;//定义
        for (int i = iceCreamPrice + drumstickPrice; i <= 100; i += iceCreamPrice + drumstickPrice) {//冰淇淋+鸡腿钱=100
            iceCreamNumber++;
            drumstickNumber++;//累加
        }
        System.out.println("买" + iceCreamNumber + "个冰淇淋和" + drumstickNumber + "个鸡腿花完100快");//输出
    }
}
/*4. 一个冰激凌需要2块钱, 一个鸡腿需要3块钱, 身上有100块钱要全部用完,
怎样买可以刚好把100块钱用完, 输出购买的组合
*/
