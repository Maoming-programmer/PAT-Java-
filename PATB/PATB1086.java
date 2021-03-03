package PATB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yylstart
 * @date 2021/3/3 -10:00
 */
public class PATB1086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int mul = a * b;
        ArrayList<Integer> arr = new ArrayList();
        while((mul / 10) != 0) {
            arr.add(mul % 10);
            mul /= 10;
        }
        arr.add(mul);
        int len = arr.size();
        int index = 0;
        //找到第一个非零数的索引
        for(int i = 0; i < len; i++) {
            if(arr.get(i) == 0) {
                index++;
            } else {
                break;
            }
        }
        for(int i = index; i < len; i++) {
            System.out.print(arr.get(i));
        }
    }
}
