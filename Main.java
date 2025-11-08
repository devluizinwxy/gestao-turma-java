
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        int c = 1;
        try{
            String opcao ="Sim";
            while (opcao.equalsIgnoreCase("Sim")) {
                List<Double> nota = new ArrayList<>();
                System.out.printf("Digite o nome do #%d Aluno: ",c);
                String nome = sc.nextLine();


                for (int i = 0; i < 4; i++) {
                    System.out.print("Digite a nota: ");
                     Double nota1 = sc.nextDouble();
                     nota.add(nota1);
                    sc.nextLine();
                }
                turma.adicionar(new Aluno(nome,nota));
                System.out.println("Deseja continuar: Sim/Não");
                opcao = sc.nextLine();
                c++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: "+ e.getMessage());
        }

        System.out.println("============== Notas dos Alunos ==============");
        turma.imprimirNotas();
        System.out.println();
        System.out.println("============== Alunos Aprovados ==============");
        turma.aprovado();
        System.out.println();
        System.out.println("============== Alunos Aprovados ==============");
        turma.reprovado();
        System.out.println("============== Media turma ==============");
        turma.mediaTurma();

    }
}
