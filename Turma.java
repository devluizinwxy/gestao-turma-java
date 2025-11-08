import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirNotas() {
        alunos.stream().forEach(n -> System.out.print("Aluno: " + n.getNome() + " - Nota: " + n.getNota()));
        try {
            Path arquivo = Path.of("notasTurma.txt");
            String conteudo = alunos.stream()
                    .map(n -> "Aluno: " + n.getNome() + " - Notas: " + n.getNota())
                    .collect(Collectors.joining(System.lineSeparator()));
            Files.writeString(arquivo, conteudo, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void aprovado() {
        alunos.stream().filter(n -> n.media() >= 7).forEach(n -> System.out.println(n.getNome() + " - " + n.getNota()));
        try {
            Path arquivo = Path.of("aprovados.txt");
            String conteudo = alunos.stream().map(n -> n.getNome() + " - " + n.getNota()).collect(Collectors.joining(System.lineSeparator()));
            Files.writeString(arquivo, conteudo, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void reprovado() {
        alunos.stream().filter(n -> n.media() < 7).forEach(n -> System.out.println(n.getNome() + " - " + n.getNota()));
        try {
            Path arquivo = Path.of("reprovados.txt");
            String conteudo = alunos.stream().map(n -> n.getNome() + " - " + n.getNota()).collect(Collectors.joining(System.lineSeparator()));
            Files.writeString(arquivo, conteudo, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            e.getMessage();
        }
    }

    public void mediaTurma() {
        double media = alunos.stream().mapToDouble(Aluno::media).average().orElse(0);
        System.out.println("Media da turma: " + media);
        try {
            Path arquivo = Path.of("media.txt");
            String conteudo = "Media da turma: " + media;
            Files.writeString(arquivo, conteudo, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


