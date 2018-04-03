import java.util.function.Predicate;
import java.util.function.Function;
import java.util.*;
class Ex3_2 {
    private static final int TEST = 3;
    private static Function<Integer, String> ternaryOperator(Predicate<Integer> Condition, Function<Integer, String> ifTrue, Function<Integer, String> ifFalse) {
        if(Condition.test(TEST))
            return ifTrue;
        else return ifFalse;
    }
    public static void main(String args[]) {
        Predicate<Integer> Condition = x -> x % 2 == 0;
        Function<Integer, String> ifTrue =
                x -> String.format("True");
        Function<Integer, String> ifFalse =
                x -> String.format("False");
        System.out.println(ternaryOperator(Condition, ifTrue, ifFalse).apply(TEST));
    }
}