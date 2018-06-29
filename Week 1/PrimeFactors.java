import java.util.ArrayList;

public class PrimeFactors {

    /* Generates prime factors of a number n */
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> result= new ArrayList<Integer>();

        // eliminate 2 and factors of it
        if (n%2==0){
            result.add(2);
            while (n%2==0){
                n=n/2;
            }
        }

        // eliminate all factors 3 and above and their factors, skip even numbers
        for (int i=3; i<Math.sqrt(n); i=i+2){
            if (n%i==0){
                result.add(i);
                while ((double)n%i==0.00){
                    n=n/i;
                }
            }
        }

        if (n>=3) {
            result.add(n);
        }

        return result;
    }
}
