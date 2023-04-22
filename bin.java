class bin
{
    public static void main(String[] args) {
        



    }
    /**
     * @param arr
     * @param target
     * @param s
     * @param e
     * @return
     */
    static int BinarySearch(int []arr, int target ,int s , int e)
    {

          if(s>e)
          {
            return -1;
          }
        int mid = s+(e-s)/2;
  if(arr[mid]==target)
  {
    return mid;
 }

 if(target<arr[mid])
 {
    return BinarySearch(arr, target, s, mid-1);
 }
   return BinarySearch(arr, target, mid+1, e); 
 }
}