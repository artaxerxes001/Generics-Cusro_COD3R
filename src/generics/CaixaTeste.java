package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<String>();
        caixaA.guardar("silencio!!!");
        System.out.println(caixaA.abrir()); Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(682.14);
        System.out.println(caixaB.abrir());
    }
}
