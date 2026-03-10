import java.util.*;
class Leftshift
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String q=sc.next();
        switch(q){
            case "AND":System.out.println(n & m);break;
            case "OR":System.out.println(n | m);break;
            case "NAND":System.out.println(~(n&m));break;
            case "XOR":System.out.println(n^m);break;
            default :System.out.println("default");
        }
    }
}
