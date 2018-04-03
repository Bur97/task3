import java.util.*;
import java.util.stream.*;

class Ex3_4 {

    public static void main(String args[]) {

        Map<String, String> students = new HashMap<String, String>();
        String fac[] = {"ФРТК", "ФОПФ", "ФАКИ", "ФМХФ", "ФФКЭ", "ФАЛТ", "ФУПМ", "ФПФЭ", "ФИВТ", "ФНБИК", "ФБМФ"};
        students.put("Маркелов Александр", fac[2]);
        students.put("Буркин Иван", fac[2]);
        students.put("Седых Елизавета", fac[2]);
        students.put("Чебыкин Глеб", fac[7]);
        students.put("Цой Юрий", fac[7]);
        students.put("Олейник Анна", fac[0]);
        System.out.println("Факультеты по алфавиту:");
        Stream<String> streamalph = Arrays.stream(fac).sorted();
        streamalph.forEach(x -> System.out.format("%s ", x));
        System.out.format("\n");
        int repeat[] = new int[11];
        for(int i = 0; i < 11; i++)
            repeat[i] = 0;
        Collection<String> studfac = students.values();
        for(int i = 0; i < 11; i++) {
            Stream<String> streampopular = studfac.stream();
            repeat[i] = (int)streampopular.filter(fac[i]::equals).count();
        }
        int popfac[] = {0, 0, 0};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 11; j++) {
                if(repeat[popfac[i]] < repeat[j])
                    popfac[i] = j;
            }
            repeat[popfac[i]] = 0;
        }
        System.out.format("Первая тройка факультетов по популярности:\n");
        for(int i = 0; i < 3; i++)
            System.out.format("%s ", fac[popfac[i]]);
        System.out.format("\n");
    }
}