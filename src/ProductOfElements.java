public class ProductOfElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6};
        for(int i=0;i<arr.length;i++)
        {
            int mul=1;
            for(int j=0;j<arr.length;j++)
            {
                if(j!=i)
                {
                    mul*=arr[j];
                }
            }
            System.out.print(mul+",");
        }
    }
}
