package PATB;

import java.util.Scanner;
import java.util.HashSet;
/**
 * @author yylstart
 * @date 2021/3/3 -10:03
 */
public class PATB1087 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        HashSet h = new HashSet();
        int count = 0;
        for(int i = 1; i <= N; i++) {
            int ans = Math.round(i / 2) + Math.round(i / 3) + Math.round(i / 5);
            if(h.contains(ans)) {
                continue;
            } else {
                h.add(ans);
                count++;
            }
        }
        System.out.println(count);
    }
}

