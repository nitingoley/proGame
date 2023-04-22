public class rev 
{

    /**
     * @param a
     * @param n
     */
    static void reverse(int a[], int n)
    
    {
 
       int i,k;
       int t;
for(i=0; i<n/2; i++)
{
 t = a[i];
 a[i] = a[n-i-1];
 a[n-i-1] = t;
}
for(k=0; k<n; i++)
{
    System.out.println("Reversed the array\n");
    System.out.println(a[k]);
}
}
public static void main(String[] args)
{
    int arr[]  = {100,30,50,30,40};
    reverse(arr, arr.length);

}
}