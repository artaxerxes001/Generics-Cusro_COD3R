package generics;

public class ParesTeste {
public static void main(String[] args) {
    Pares<Integer, String> resultadoCurso = new Pares<>();
    Pares<Integer, String> wresultadoCurso = new Pares<>();

    resultadoCurso.adicionar(1, "Maria");
    resultadoCurso.adicionar(2, "Pedro");
    resultadoCurso.adicionar(3, "Gui");
    resultadoCurso.adicionar(4, "Ana");
    resultadoCurso.adicionar(2, "Rebeca");

    System.out.println(resultadoCurso.getValor(1));
    System.out.println(resultadoCurso.getValor(4));
    System.out.println(resultadoCurso.getValor(2));
}
}
