package HowToProgramJava;


public class Palindrome {

    public boolean iSPalindrome(String s)
    {
        int i=0, j=s.length() - 1;
        while (i < j)
        {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) i--;
            if(Character.toLowerCase(s.charAt(j)) !=Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++; j--;
        }
        return true;

    }

    public static void main(String [] args)
    {
        Palindrome  test_2  = new Palindrome();


        test_2.iSPalindrome("level");

        System.out.println(test_2);
    }



}
