import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        long inicio, fim;
        long n = 12600000;
        inicio = System.currentTimeMillis();
        List<Aluno> array = new LinkedList<>();
        for(long i=0; i<n;i++){
            array.add(new Aluno((int)i, "No non no non no " + i, "EC"));
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para inserir: " + (fim-inicio)/1000.0 + " segundo");
        inicio = System.currentTimeMillis();
        for(Aluno o : array){
            Aluno x = o;
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para iterar: " + (fim-inicio)/1000.0 + " segundo");
    }
}
