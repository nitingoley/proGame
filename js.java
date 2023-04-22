class js
{
    public static void main(String[] args) {
        bin(20);
        
    }
    static void bin(int dec)
    {
        int[] binary = new int[20];
         int index = 0;
         while(dec>0)
         {
            binary[index++]=dec%2;
         dec = dec/2;

         }         
    for(int i=index-1; i>0; i--)
    {
        System.out.print(binary[i]);
    }
    System.out.println();
 
        }
    }