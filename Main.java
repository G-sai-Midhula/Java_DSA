// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder();
//         for(int i=1;i<=s.length();i++)
//         {
//             sb.append(i);
//         }
//         for(char i=0;i<sb.length();i++)
//         {
//             System.out.println(sb.charAt(i)+"");
//         }
//     }
// }

          //REMOVING VOWELS

// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);
//         String a="aeiou";
//         for(int i=0;i<sb.length();i++)
//         {
//             char c=s.charAt(i);
//             if(a.indexOf(c)!=-1){
//                 sb.deleteCharAt(i);
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }

            //INSERT MENTHOD()

// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s1=sc.nextLine();
//         String s2=sc.nextLine();
//         int pos=sc.nextInt();
//         StringBuilder sb=new StringBuilder(s1);
//         sb.insert(pos,s2);
//         System.out.println(sb.toString());
//     }
// }
           //REPLACE

    // import java.util.*;
    // class Main{
    //     public static void main(String args[])
    //     {
    //         Scanner sc=new Scanner(System.in);
    //         String s1=sc.nextLine();
    //         String s2=sc.nextLine();
    //         String replace = sc.nextLine();
    //         StringBuilder sb=new StringBuilder(s1);
    //         int index=s1.indexOf(s2);
    //         while(index!=-1)
    //         {
    //             sb.replace(index,index+s2.length(),replace);
    //             System.out.println(sb);
    //         }
    //         System.out.println(sb.toString());
    //     }
    // }
             //PALINDROME
// import java.util.*;
// class Main{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);
//         String st=sb.reverse().toString();
//         System.out.println(st);
//         if(st.equals(s))
//         {
//             System.out.println("palindrome");
//         }
//         else
//         {
//             System.out.println("nopt palindrome");
//         }
//     }
// }
// import java.util.*;
// class Main{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();

//         StringBuilder sb=new StringBuilder(s); // pass string here
//         String st=sb.reverse().toString();     // reverse and convert to string

//         System.out.println(st);

//         if(st.equals(s))
//         {
//             System.out.println("palindrome");
//         }
//         else
//         {
//             System.out.println("not palindrome");
//         }
//     }
// }

// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);
//         for(int i=0;i<db.length;i++)
//         {
//             if(sb.charAt(i)%2==0)
//             {
//                 sb.toUpperCase().toString();
//             }
//             else{
//                 sb.toLowerCase().toString();
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }
             //UPPERCASE AND LOWERCASE 
// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);

//         for(int i=0;i<sb.length();i++)   
//         {
//             char ch = sb.charAt(i);

//             if(i % 2 == 0)  
//             {
//                 sb.setCharAt(i, Character.toUpperCase(ch));
//             }
//             else
//             {
//                 sb.setCharAt(i, Character.toLowerCase(ch));
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            String ss=sc.nextLine();
            if(i<n-1)
            sb.append(ss+",");
            else
            sb.append(ss);
        }
        System.out.println(sb.toString());
    }
}
    
        
        





