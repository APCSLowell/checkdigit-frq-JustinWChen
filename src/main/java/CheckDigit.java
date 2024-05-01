public class CheckDigit 
{

   public static int getCheck(int num) 
   {
     int d = 0;
     for (int i = 1; i <= getNumberOfDigits(num); i++){
       d += getDigit(num, i)*(8-i);
     }
     return d%10;
   }
 
   public static boolean isValid(int numWithCheckDigit)
   {
     int iC = numWithCheckDigit%10;
     int c = numWithCheckDigit/10;
     int gC = getCheck(c);
     return gC==iC;

   }

   public static int getNumberOfDigits(int num)
   {
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);
   }

    public static int getDigit(int num, int n)
    {
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }

}
