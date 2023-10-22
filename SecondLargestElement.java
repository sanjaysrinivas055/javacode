public class Second {
    static int secondlargest(int arr[])
    {
        int max=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                second=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>second)
            {
                second=arr[i];
            }

        }
        return second;
    }
    public static void main(String[] args)
    {
        int arr[]={2,5,8,9,10,11,1};
        System.out.println(secondlargest(arr));

    }
}
