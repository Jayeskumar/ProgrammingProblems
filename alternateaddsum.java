public class alternateaddsum {
    /*Given a number N (1<=N<=10000), and an option opt=1 or 2, find the result as per
below rules, If opt=1,
Result= N-(N-1)+(N-2) - (N-3) +(N-4) ......till 1
If opt=2
Result= N+(N-1)- (N-2) + (N-3) - (N-4)..... till 1
Example1: IfN = 6, and opt=1
Result =6-5+4-3+2-1=3
Example2 If N = 6, and opt=2
Result =6+5-4+3-2+1= 9
The function prototype should be as belowint AddSub(int N, int opt); */
    static int AddSub(int N, int opt) {
        int sum=0;
        sum+=N;
        N=N-1;
        if(opt==2)
        {
        if(N%2==0)
        {
        while(N>0)
        {
        if(N%2==0)
        sum+=N;
        else
        sum-=N;
        N--;
        }
        }
        else
        {
        while(N>0)
        {
        if(N%2==0)
        sum-=N;
        else
        sum+=N;
        N--;
        }
        }
        }
        else
        {
        if(N%2==0)
        {
        while(N>0)
        {
        if(N%2==0)
        sum-=N;
        else
        sum+=N;
        N--;
        }
        }
        else
        {
        while(N>0)
        {
        if(N%2==0)
        sum+=N;
        else
        sum-=N;
        N--;
        }
        }
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 6;
        int opt = 1;
        System.out.println(AddSub(N, opt));
    }
    
}
