import java.util.Scanner;
public class Q2 {public static void main (String[] args) {
    //code
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-- > 0)
    {
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    int x2 = in.nextInt();
    int y2 = in.nextInt();
    int x3 = in.nextInt();
    int y3 = in.nextInt();
    int x4 = in.nextInt();
    int y4 = in.nextInt();
    if(isOverLapping(x1,y1,x2,y2,x3,y3,x4,y4) == true)
    System.out.println(1);
    else
    System.out.println(0);
    }
    }
    public static boolean isOverLapping(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
    {
    if(x4 < x1 || x3 > x2)
    return false;
    else if(y3 < y2 || y4 > y1)
    return false;
    else
    return true;
    }}