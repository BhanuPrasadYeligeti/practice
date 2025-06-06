//input:10101001 output:00001111
public class SwapArrayElements {
    public static void swap(int left,int right,int[]arr)
    {
        int temp=0;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;


    }
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,1};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]==1&&arr[right]==0)
            {
                swap(left,right,arr);
                left+=1;
                right-=1;
            } else if (arr[left]==0) {
                left+=1;
            } else if (arr[right]==1) {
                right-=1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
