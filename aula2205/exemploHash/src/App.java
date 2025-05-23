import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(55, "Maria", "EC");
        Aluno aluno2 = new Aluno(17, "Marta", "EC");
        Aluno aluno3 = new Aluno(33, "Mariangela", "EP");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);
        Collections.sort(lista);
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }

        /* 
        Aluno alunoProc = new Aluno();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ra a ser encontrado: ");
        alunoProc.setRa(Integer.parseInt(input.nextLine()));
        if(lista.contains(alunoProc)){
            System.out.println("Aluno encontrado");
            int indice = lista.indexOf(alunoProc);
            System.out.println(indice);
            alunoProc = lista.get(indice);//
           
            System.out.println("Dados do aluno: ");
            System.out.println(alunoProc);
        }else{
            System.out.println("Aluno nao encontrado");
        }

        */
    }
}
