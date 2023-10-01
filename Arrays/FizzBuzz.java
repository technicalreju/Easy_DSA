import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        // Initialize a list to store the FizzBuzz sequence
        List<String> result = new ArrayList<>();

        // Iterate from 1 to 'n'
        for (int i = 1; i <= n; i++) {
            // Check if the current number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            // Check if the current number is divisible by 3
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            // Check if the current number is divisible by 5
            else if (i % 5 == 0) {
                result.add("Buzz");
            }
            // If none of the above conditions are met, add the number as a string
            else {
                result.add(Integer.toString(i));
            }
        }

       return result;
    }
}
