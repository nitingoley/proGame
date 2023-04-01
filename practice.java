class practice
{
    public static void main(String[] args) {
        int arr[] ={10,2,24,0,1,0,2};
        int n = arr.length;
        System.out.println(twiceArray(arr, n));
        
    }
    static int twiceArray(int arr[], int arr_size)
    {
        for(int i=0; i<arr_size; i++)
        {
            int count =0;
            for(int j=0; j<arr_size; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
}