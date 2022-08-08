package ss2_loop_statement.Bai_tap;

import java.util.Scanner;

public class SNT_100 {
    public static void main(String[] args) {
        for(int a = 2; a<=100;a++){
            for ( int i=2;i<Math.sqrt(a);i++){
                if(a%i==0){
                    continue;
                }else {
                    System.out.printf(a + "\t");
                }
            }
        }
    }
}
