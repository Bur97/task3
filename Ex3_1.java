import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.*;
class Ex3_1 {

    public static void main(String args[]) {

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                ArrayList<Integer> result = new ArrayList<Integer>();
                Predicate<Integer> isEven = x -> x % 2 == 0;
                for(int num : numbers) {
                    if(isEven.test(num))
                        result.add(num * 3);
                    if(!isEven.test(num))
                        result.add(num * 5);
                }
                for(int num : result)
                    System.out.format("%d ", num);
                System.out.format("\n");
    }
}