import java.util.*;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        char[] a= s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));
    }
}

// import java.util.*;

// class Test {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String t = sc.nextLine();

//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         System.out.println(Arrays.equals(a, b));
//     }
// }