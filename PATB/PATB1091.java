package PATB;

import java.util.Scanner;

/**
 * @author yylstart
 * @date 2021/2/24 -9:01
 */

public class PATB1091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int a[] = new int[m];
        for(int i = 0 ; i < m ; i++) {
            boolean flag = false;
            a[i] = scan.nextInt();
            for(int j = 1; j < 10; j++) {
                int kn2 = j * a[i] * a[i];
                int product = 10;
                while(kn2 / product != 0) {
                    if(kn2 % product == a[i]) {
                        System.out.println(j+" "+kn2);
                        flag = true;
                        break;
                    }
                    product *= 10;
                }
                if(flag == true) break;
                //判断最高位(kn2本身)
                if(kn2 % product == a[i]) {
                    System.out.println(j+" "+kn2);
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                System.out.println("No");
            }
        }
    }
}
