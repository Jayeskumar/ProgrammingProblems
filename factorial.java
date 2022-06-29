class Fact{
    //iterative factorial
    static int fact(int n){
        //factorial using iteration
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    //recursive factorial
    static int factRec(int n){
        //factorial using recursion
        if(n == 0){
            return 1;
        }
        return n * factRec(n-1);
    }
    

}
