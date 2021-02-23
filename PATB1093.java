package PATB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author yylstart
 * @date 2021/2/23 -23:14
 */
public class PATB1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int len1 = str1.length();
        int len2 = str2.length();

        HashSet h = new HashSet();
        for(int i = 0; i < len1; i++) {
            char c = str1.charAt(i);
            if(!h.contains(c)) {
                h.add(c);
                System.out.print(c);
            }
        }
        for(int i = 0; i < len2; i++) {
            char c = str2.charAt(i);
            if(!h.contains(c)) {
                h.add(c);
                System.out.print(c);
            }
        }
    }
}
