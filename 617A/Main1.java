import java.util.*;

public class Main1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //For scanning purpose
        int cnt=0;
        int x = sc.nextInt();
        while(x!=0){
        if(x>=5)
        {   
            x=x-5;
            cnt++;
        }
        else if(x>=4)
        {   
            x=x-4;
            cnt++;
        }
        else if(x>=3)
        {   
            x=x-3;
            cnt++;
        }
        else if(x>=2)
        {   
            x=x-2;
            cnt++;
        }
        else if(x>=1)
        {   
            x=x-1;
            cnt++;
        }
        }
        System.out.println(cnt);
    }
    
}