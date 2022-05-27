import java.sql.SQLOutput;

public class NTo1Recursion {
    public static void printN(int n){
        if(n==1){
            System.out.println("n = " + n);
            return ;
        }
        System.out.println("n = " + n);
        printN(n-1);


    }
    public static void main(String[] args) {
        printN(100);
    }
}
