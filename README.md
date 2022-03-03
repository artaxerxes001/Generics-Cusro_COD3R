# Generics
Generics são classe cujo o tipo de dados deixamos para serem definidos no momento de instanciar ou pelas suas subclasses.

**Definir uma class como generica.**

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

## Definir o tipo de um Generics

### Ao instanciar a classe

```java
Caixa<String> caixaA = new Caixa<String>();
```

### Ao Herandar

```java
public class CaixaInt extends Caixa<Integer> {

}
```

* Podemos passar outro generico no momento da herança

```java
public class CaixaInt<X> extends Caixa<X> {

}
```

* Podemos fazer retrições quanto a qual vai ser o tipo do generico.

```java
public class CaixaNumero<N extends Number> extends Caixa<N>{
}
```

Nesse caso os genericos de CaixaNumero tem de ser tipos que são ou herdam de Number.

* Criar metodo com Generics

```java
public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
```

Nesse caso <T'> generics T tipo de retorno.

```java
//  criar metodo com generics com mais de um parametro
    public static <A,B,C> C teste(A paramA, B paramB){
        C test = null;
        return test;
    }
```
