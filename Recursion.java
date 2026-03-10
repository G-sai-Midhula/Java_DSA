// class Recursion
// {
//     int rec(int num)
//     {
//         if(num<=1)
//         {
//             return num;
//         }
//         return rec(num-1)+rec(num-2);
//     }
//     public static void main(String args[])
//     {
//         Recursion ob=new Recursion();
//         for(int i=0;i<=20;i++){
//         System.out.println(ob.rec(i));
//         }
//     }
// }
                 //INDIRECT RECURSSION
// class Recursion
// {
//     void ma(int n)
//     {
//         if(n>0)
//         {
//             System.out.println(n);
//             mb(n-1);
//         }
//     }
//     void mb(int n)
//     {
//         if(n>0)
//         {
//             System.out.println(n);
//             ma(n/2);
//         }
//     }
//     public static void main(String args[])
//     {
//         Recursion ob=new Recursion();
//         ob.ma(10);
//     }
// }

// class Recursion{
//     int sum=0;
//     void ma(int n)
//     {
//         if(n>0)
//         {
//             sum=sum+n;
//             mb(n-1);
//         }
//     }
//     void mb(int n)
//     {
//         if(n>0)
//         {
//             sum=sum+n;
//             ma(n-1);
//             }
//     }
//     public static void main(String args[])
//     {
//         Recursion rr=new Recursion();
//         rr.ma(10);
//         System.out.println("sum:"+rr.sum);
//         }
// }

                  FACTORS
class Recursion
{
    void ma(int n,int i)
    {
        if(i>n)
        {
            return;
        }
        if(n%i==0)
        {
            System.out.println(i);
        }
            ma(n,i+1);
    }
    public static void main(String args[])
    {
        Recursion rr=new Recursion();
        rr.ma(10,1);
    }
}