package ss2_loop_statement.Bai_tap;

public class SNT_100 {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++) {
            int dem = 0;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    dem++;
                }
            }
            if(dem==0){
                System.out.println(a + "\t");
            }
        }
    }
}
