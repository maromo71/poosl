import java.util.LinkedList;
import java.util.List;

public class TesteMetodos {
    public static void main(String[] args) {
        List lista = new LinkedList();
        lista.add("Mariana");
        lista.add(123);
        lista.add("Bob");
        lista.add(System.currentTimeMillis());
        lista.add(new Object());
        lista.add("Bob");
        lista.add(12.45);

        lista.remove((Integer)123);
        //metodo size
        System.out.println("Qtd: " + lista.size());
        //ver se tem bob na lista
        if(lista.contains("Bob")){
            System.out.println("Tem bob na lista");
        }
        while(lista.contains("Bob")) lista.remove("Bob");
        //percorrer
        for(Object objeto : lista) {
            System.out.println(objeto);
        }
    }
}
