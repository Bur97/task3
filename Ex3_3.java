import java.util.stream.*;
import java.util.*;

class Ex3_3 {
    public static void main(String args[]) {
        String string = "aa ab ac ad aaaaaaa ba bc bb abc a";
        String array[] = string.split(" ");
        Stream<String> stream = Arrays.stream(array).filter(x -> x.length() < 5 && x.charAt(0) == 'a');
        stream.forEach(x -> System.out.format("%s %d\n", x, x.length()));
    }
}