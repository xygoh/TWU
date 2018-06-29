public class FizzBuzz {
/* A simple number game that prints out numbers 1 - 100
   if divisible by 3: Prints "Fizz"
   if divisible by 5: Prints "Buzz"
   if divisible by both: Prints "FizzBuzz"
 */
    public static String FizzBuzz(){
        StringBuilder sb= new StringBuilder();
        for (int i=1; i<=100; i++){
            if (i%3==0){
                if (i%5==0){
                    System.out.println("FizzBuzz");
                    sb.append("FizzBuzz\n");
                }else{
                    System.out.println("Fizz");
                    sb.append("Fizz\n");
                }
            }else if (i%5==0){
                System.out.println("Buzz");
                sb.append("Buzz\n");
            }else{
                System.out.println(i);
                sb.append(i+"\n");
            }
        }
        return sb.toString();
    }

}
