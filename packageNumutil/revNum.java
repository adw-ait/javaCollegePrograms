package packageNumutil;

public class revNum
{
    int temp, digit;
    int rev = 0;

    public revNum(int num)
    {
        temp = num;
    }
   public void reverseNum()
    {
        
        
        while(temp != 0)
        {
            digit = temp%10;
            rev = (rev * 10) + digit;
            temp = temp/10;
        }
    }

    public void display()
    {
        System.out.println("\nReversed number : "+rev);
    }
}