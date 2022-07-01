class Fibonacci{
    static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    //iterative fibonacci
    static int fibonacciIterative(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        return c;

    }
}