package MathProblems;

public class ReverseNum {
    public static int reverseNum(int x) {
        int rem = 0;
        int num = x;
        int revNum = 0;
        while(num != 0){
            rem = num % 10;
            num /= 10;
            revNum = revNum*10 + rem;
        }

        System.out.println("Reversed Number : "+ revNum);
        return revNum;
    }
}
