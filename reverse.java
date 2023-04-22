class reverse
{
    public static void main(String[] args) {
        
String name = "Nitin Goley";
int len = name.length();
String reb = "";
for(int i=len-1; i>=0; i--)

{
    reb = reb+name.charAt(i);

}
System.out.println(reb);
    }
}