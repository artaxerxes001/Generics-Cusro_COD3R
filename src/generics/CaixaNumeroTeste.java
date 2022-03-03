package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> numeroA = new CaixaNumero<>();
        numeroA.guardar(374.37);
        System.out.println(numeroA.abrir());CaixaNumero<Integer> numeroB = new CaixaNumero<>();
        numeroB.guardar(842);
        System.out.println(numeroB.abrir());
    }
}
