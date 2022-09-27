
import java .util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        String b=input.nextLine();
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();

        int i,j,count=0,x,max=0,c,z=0,y=0,z1=0;

        for(i=0;i<a.length();i++)
        {
            for(j=0;j<b.length();j++)
            {
                if(a1[i]==b1[j])
                {
                    count=1;
                    c=j+1;
                    for(x=i+1;x<a.length();x++)
                    {if(c<b.length()) {
                        if (a1[x] == b1[c]) {
                            count++;
                        } else {
                           z=x;
                            x = a.length() + 1;

                        }
                    }
                    else{z=x;x=a.length();}
                        c++;
                    }
                }
                if(max<count)
                {z1=z;
                    y=i;
                    max=count;

                }
            }
        }
        System.out.println(max);
     for(x=y;x<z1;x++)
     {
         System.out.print(a1[x]);
     }

    }
}