import java.util.ArrayList;

public class Largest_prime_factor {
    public static void main(String agr[]){
        int largest = 0;
        long largePrime = Long.valueOf("600851475143");
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 3;
        while(largePrime != 1){
            if(largePrime % num == 0){
                primes.add(num);
                largePrime /= num;
                largest = num;
            }
            num+=2;
        }
        System.out.print(largest);
    }
}
