import java.util.Scanner;
public class monthname {

        static String[] s = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December","InvalidNumber"};
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number between 1 to 12");
            int n = sc.nextInt();
            String str=monthName1(n);
            System.out.println("Month name:"+str);
        }
        static String monthName1(int n)
        {
            if(n>=1 && n<=12)
                return monthname.s[n-1];
            else
                return monthname.s[12];
        }
    }

