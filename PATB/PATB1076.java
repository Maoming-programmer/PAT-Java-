package PATB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author yylstart
 * @date 2021/2/25 -11:22
 */
public class PATB1076 {

    public static HashMap h = new HashMap();

    public static void main(String[] args) {

        //初始化
        h.put('A',1);
        h.put('B',2);
        h.put('C',3);
        h.put('D',4);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //题目个数
        ArrayList ans = new ArrayList();
        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < 4 ; j++) {
                String str = scan.next();
                if(str.charAt(2) == 'T') {
                    ans.add(h.get(str.charAt(0)));
                }
            }
        }
        Iterator iterator = ans.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
