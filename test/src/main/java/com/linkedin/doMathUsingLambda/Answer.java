// Java code​​​​​​‌​‌‌​‌​​​​‌‌‌‌‌‌‌‌‌​‌​‌‌​ below
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

// Write your answer here, then test your code.
class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Create constants representing the four available math functions
    public static final String ADD = "ADD";
    public static final String SUBTRACT = "SUBTRACT";
    public static final String MULTIPLY = "MULTIPLY";
    public static final String DIVIDE = "DIVIDE";

    // Do mathematical calculations using lambda expressions
    public static Map<String, Float> calculate(float value1, float value2) {

        // Your code goes here
        // Create 4 instances of the BiFunction interface referencing lambda expressions
        BiFunction<Float, Float, Float> function1 = Float::sum;
        BiFunction<Float, Float, Float> function2 = (a, b) -> a - b;
        BiFunction<Float, Float, Float> function3 = (a, b) -> a * b;
        BiFunction<Float, Float, Float> function4 = (a, b) -> a / b;

        return new HashMap<>(
                Map.of(ADD, function1.apply(value1, value2), SUBTRACT, function2.apply(value1, value2), MULTIPLY, function3.apply(value1, value2), DIVIDE,
                        function4.apply(value1, value2)));
    }

}
