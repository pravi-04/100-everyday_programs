import java.util.*;
public class factorialrec {
    public static int factorial(int n){
        int ans=1;
        for(int i=0;i<n;i++){
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = factorial(n);
        System.out.print("the factorial is"+output);    
        sc.close();
    }
}
