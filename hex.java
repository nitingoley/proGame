public class hex {
    public static void main(String[] args) {
        


        System.out.println(Integer.toHexString(10));
    
    /**
     * @param dec
     */
    static void bin(int dec)
    {
        int bin[] = new int[100];
        int index=0;
        while (dec>0) {
            bin[index++]=dec%2;
            dec = dec/2;
        }
 for(int i=0; i<bin; i++)
 {
    System.out.println(bin[i]);
 }   
}
    }