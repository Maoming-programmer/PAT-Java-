package PATB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yylstart
 * @date 2021/3/3 -14:22
 */
public class PATB1089 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp;
        ArrayList<Integer> dig = new ArrayList(n + 1);    //保留对话
        dig.add(0); //填充
        for (int i = 1; i <= n; i++) {
            temp = scan.nextInt();
            dig.add(i,temp);
        }
        for(int i = 1 ; i <= n ; i++) {
            for(int j = i + 1; j <= n ; j++) {
                ArrayList<Integer> lie = new ArrayList<>(); //假话
                int ans[] = new int[n + 1]; //真实身份
                for(int index = 1; index <= n; index++) {
                    ans[index] = 1; //初始化为好人
                }
                //指定两个狼人
                ans[i] = -1;
                ans[j] = -1;
                for(int k = 1; k <= n ; k++) {
                    if((dig.get(k) * ans[Math.abs(dig.get(k))]) < 0) {
                        lie.add(k); //找到说谎的人
                    }
                }
                if((lie.size() == 2) && (ans[lie.get(0)] + ans[lie.get(1)] == 0)) {
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
        System.out.print("No Solution");
    }
}
