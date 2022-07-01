import java.util.*;
public class mytest {
    static int sumitSum(int input1, int input2, int input3, int input4, int input5) {
        int sum=0;
    char ch1[]=(String.valueOf(input1)).toCharArray();
    Arrays.sort(ch1);
    sum+=Integer.parseInt(String.valueOf(ch1[0])+String.valueOf(ch1[1]));
    char ch2[]=(String.valueOf(input2)).toCharArray();
    Arrays.sort(ch2);
    sum+=Integer.parseInt(String.valueOf(ch2[0])+String.valueOf(ch2[1]));
    char ch3[]=(String.valueOf(input3)).toCharArray();
    Arrays.sort(ch3);
    sum+=Integer.parseInt(String.valueOf(ch3[0])+String.valueOf(ch3[1]));
    char ch4[]=(String.valueOf(input4)).toCharArray();
    Arrays.sort(ch4);
    sum+=Integer.parseInt(String.valueOf(ch4[0])+String.valueOf(ch4[1]));
    char ch5[]=(String.valueOf(input5)).toCharArray();
    Arrays.sort(ch5);
    sum+=Integer.parseInt(String.valueOf(ch5[0])+String.valueOf(ch5[1]));
    return sum;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println(sumitSum(23792,37221,10270,73391,12005));
    }
    
}
