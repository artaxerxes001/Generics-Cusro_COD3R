package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        String ultimalinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimalinguagem1);
        Integer ultimoNum1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNum1);
        String ultimalinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimalinguagem2);
// se quizermos especificar ainda mais
        Integer ultimoNum2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNum2);
    }
}
