package PATB;

import java.util.Scanner;

/**
 * @author yylstart
 * @date 2021/3/3 -10:14
 */
public class PATB1088 {

    public static int jia;
    public static int yi;
    public static double bing;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(); //自己的能力值
        int x = scan.nextInt();
        int y = scan.nextInt();
        int max = 0;
        boolean flag = false;
        int a,b;

        for(int i = 10 ; i <= 99; i++) {
             a = i;  //临时甲
             b = (i % 10 * 10) + (i / 10);   //临时乙
             double a1 = 1.0 * Math.abs(a - b) / x; //用小数存储
             double b1 = (1.0 * b) / y;
             if(a1 == b1) {
                if(a >= max) {
                    max = a;
                    jia = a;
                    yi = b;
                    bing = b1;
                }   //判断是否比最大值大
                flag = true;
             }
        }

        double arr[] = new double[]{jia,yi,bing};

        if(flag == false) {
            System.out.println("No Solution");
        } else {
            System.out.print(jia);
            for(int i = 0; i < 3; i++) {
                System.out.print(" ");
                if(m < arr[i]) {
                    System.out.print("Cong");
                } else if(m == arr[i]) {
                    System.out.print("Ping");
                } else {
                    System.out.print("Gai");
                }
            }
        }
    }
}
