
package fizzbuzz;


public class FizzBuzz {

    
    public static void main(String[] args) {
        for (int i = 1; i<= 100; i++){
            System.out.println(Divider(i));
        }
    }

    static String Divider(int i) {
        if(i % 15 == 0){
            return "FizzBuzz";
        }
        else if(i % 3 == 0){
            return "Fizz";
        }
        else if(i % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(i);
    }

    
    
}
