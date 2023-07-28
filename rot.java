public class rot{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=6;
        while(k-->0){
        int n=arr[4];
        for(int i=4;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=n;
    }
    for(int i=0;i<5;i++){
        System.out.print(" "+arr[i]);
    }
    }

}