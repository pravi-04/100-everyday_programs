import java.util.*;
public class frequencydp {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int count=1;
            if (dp[i]!=-1){
                for(int j=i+1;j<n;j++){
                    if (arr[i]==arr[j]){
                        dp[j]=-1;
                        count++;
                    }
                    
                }
                dp[i]=count;

            }

        }

        for(int k=0;k<n;k++){
            if (dp[k]!=-1){
                System.out.println(arr[k]+":"+ dp[k]);

            }
        }


     }
}
