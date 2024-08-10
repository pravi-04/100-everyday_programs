import java.util.*;
public class naturalrec {

    static void naturalnum(int i,int n){
        if (i>n) return;
        System.out.println(i);
        
        naturalnum(i+1,n);
    
    
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naturalnum(1,n);
        sc.close();
    

    }
}
