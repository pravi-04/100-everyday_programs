
public class sortin2ways {
    public static void main(String[] args){
        int arr[]={5, 2, 9, 1, 5, 6, 3, 8};

        for(int i=0;i<(arr.length/2)-1;i++){
            for(int j=0;j<(arr.length/2)-i-1;j++){
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }

        for(int i=(arr.length)-1;i>arr.length/2;i--){
            for(int j=(arr.length)-1;j>arr.length/2;j--){
                if (arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
    
}
