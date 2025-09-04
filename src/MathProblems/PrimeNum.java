package MathProblems;

public class PrimeNum extends Factors{
    public boolean isPrime(int n) {
        FactorOperations f = new Factors();
        int count = f.factorsCount(n);
        return count <= 2;
    }
}
