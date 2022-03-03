# Generics

Definir uma class como generica.

```java
// <T> representa que a classe é do tipo generico T, que pode ser qualquer coisa
public class Caixa<T> {
    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}

```

### Definir o Generics

* Ao instanciar da classe

```java
Caixa<String> caixaA = new Caixa<String>();
```

* Ao Herandar

```java
public class CaixaInt extends Caixa<Integer> {

}
```
**OBS:** podemos passar outro generico no momento da herança

```java
public class CaixaInt<X> extends Caixa<X> {

}
```
    