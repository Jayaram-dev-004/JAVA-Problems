package MathProblems;

import java.util.ArrayList;
import java.util.List;

public class Factors implements FactorOperations{

    private List<Integer> list = new ArrayList<>();
    private int len = 0;

    public List<Integer> factors(int n){
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);

            if(i != n / i)
                list.add(n/i);
            }
        }
        len = list.size();
//        System.out.println("Factors are : "+list);

        return list;
    }

    public int factorsCount(int n){
        this.factors(n);
//        System.out.println("Number of factors : "+ len);
        return len;
    }
}
