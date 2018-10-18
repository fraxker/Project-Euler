public class Even_Fibonacci_numbers {
    public static void main(String agr[]){
        int sum = 0;
        int oldfib = 0;
        int fib = 1;
        int newfib = 2;
        while(fib < 4000000){
            if(newfib % 2 == 0)
                sum += newfib;
            oldfib = fib;
            fib = newfib;
            newfib = oldfib + newfib;
        }
        System.out.print(sum);
    }
}
