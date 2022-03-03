package generics;

public class Caixa<T> // <T> representa que a classe é do tipo generico T, que pode ser qualquer coisa
{
    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}
