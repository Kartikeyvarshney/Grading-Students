import java.util.Scanner;
class RoundOff
{
    int grades(int marks)
    {
        if ( marks > 37 && marks%5!=0 && marks <= 100)
        {
            int tag = marks;
            while(tag%5!=0)
            {
                tag = tag + 1;
            }
            if ((tag - marks) < 3)
            {
                marks = marks + (tag - marks);
            }
            return marks;
        }
        else 
        {
            return marks;
        }
        
    }
}
class Solution
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        RoundOff R = new RoundOff();
        int students = sc.nextInt();
        int marks[] = new int[students];
        for (int i =0 ; i < students ; i++)
        {
            marks[i] = sc.nextInt();
        }
        for ( int j = 0 ; j < students ; j++)
        {
             System.out.println(R.grades(marks[j]));
        }
       
    }
}
