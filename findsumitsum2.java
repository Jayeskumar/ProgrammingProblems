import java.util.*;
public class findsumitsum2 {
/*   FindSumeetSum: Sum of smallest 3- digit numbers from given 5 numbers
Given 5 input numbers, Sumeet has to find the sum of the smallest numbers that can be
produced using 3 digits from each of the above 5 numbers
Example-1
If the 5 input numbers are 23792,37221,10270,73391 and 12005
The smallest numbers that can be produced using 3 digits from each of these are
223,122,001,133 and 001 respectively, and the sum of these smallest numbers will be 480.
Therefore, the expected result is 480
Example-2
If the 5 input numbers are 26674,105,37943,95278 and 27845,
The smallest numbers that can be produced using 3 digits from each of these are
246,015,334,257 and 245 respectively, and the sum of these smallest numbers will be 1097.
Therefore, the expected result is 1097.
NOTE- All the given 5 numbers will be >=100 and <=99999
Function prototype is as belowInt findSumeetSum(int input1,int input2,int input3,int input4,int input5)*/
static int sumitSum(int input1, int input2, int input3, int input4, int input5) {
    int sum=0;
char ch1[]=(String.valueOf(input1)).toCharArray();
Arrays.sort(ch1);
sum+=Integer.parseInt(String.valueOf(ch1[0]) + String.valueOf(ch1[1]) + String.valueOf(ch1[2]));
char ch2[]=(String.valueOf(input2)).toCharArray();
Arrays.sort(ch2);
sum+=Integer.parseInt(String.valueOf(ch2[0]) + String.valueOf(ch2[1]) + String.valueOf(ch2[2]));
char ch3[]=(String.valueOf(input3)).toCharArray();
Arrays.sort(ch3);
sum+=Integer.parseInt(String.valueOf(ch3[0]) + String.valueOf(ch3[1]) + String.valueOf(ch3[2]));
char ch4[]=(String.valueOf(input4)).toCharArray();
Arrays.sort(ch4);
sum+=Integer.parseInt(String.valueOf(ch4[0]) + String.valueOf(ch4[1]) + String.valueOf(ch4[2]));
char ch5[]=(String.valueOf(input5)).toCharArray();
Arrays.sort(ch5);
sum+=Integer.parseInt(String.valueOf(ch5[0]) + String.valueOf(ch5[1]) + String.valueOf(ch5[2]));
return sum;    
}
public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    System.out.println(sumitSum(23792,37221,10270,73391,12005));
}
}
