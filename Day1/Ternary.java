// import java.util.*;
// class Ternary{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         switch(n){
//             case 1:System.out.println("January February March April May June July August September October November December");break;
//             case 2:System.out.println(" February  March April May May June July August September October November December");break;
//             case 3:System.out.println("March April May May June July August September October November December");break;
//             case 4:System.out.println(" April May May June July August September October November December");break;
//             case 5:System.out.println(" May June July August September October November December");break;
//             case 6:System.out.println(" June July August September October November December");break;
//             case 7:System.out.println("July August September October November December");break;
//             case 8:System.out.println(" August September October November December");break;
//             case 9:System.out.println(" September October November December");break;
//             case 10:System.out.println("October November December");break;
//             case 11:System.out.println(" November December");break;
//             case 12:System.out.println("December");break;
//             case 13:System.out.println("Invalid Mon");break;
            
//         }
//     }
// }

import java.util.*;
class Ternary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(arr[j]>arr[k])
                {
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
