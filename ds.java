public class ds {
 public static void main(String[] args) {
    int []arr  = {1,23,30,40,50,90};
    int aim = 50;
    System.out.println(BinarySearching(arr, aim, 0, arr.length-1));
    
 }  
 static int BinarySearching(int[]arr , int aim , int s , int e)
{

 if(s>e)
 {
 return -1;
  }
  int mi = s+(e-s)/2;

  if(arr[mi]==aim)
  {
    return mi;
  }
  if(aim<arr[mi])
  {
    return BinarySearching(arr, aim, s, mi-1);
  }
  return BinarySearching(arr, aim, mi+1, e);
  
}
}
