import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> nota;

    public Aluno(String nome, List<Double> nota) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("O nome não pode ser null ou vazio!");
        nome = nome.trim();
        if (!nome.matches("^\\p{Lu}\\p{L}+\\s\\p{Lu}\\p{L}+(\\s\\p{Lu}\\p{L}+)?$"))
            throw new IllegalArgumentException("O nome é inválido");
        this.nome = nome;
        if (nota == null || nota.isEmpty())
            throw new IllegalArgumentException("A Lista de notas não pode ser null ou vazia!");
        for (Double n : nota) {
            if (n == null) throw new IllegalArgumentException("A Nota não pode ser null!");
            if (n < 0) throw new IllegalArgumentException("A nota não pode ser menor que 0");
            if (n > 10) throw new IllegalArgumentException("A nota não pode ser maior que 10");
        }
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNota() {
        return nota;
    }

    public Double media() {
        return nota.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }


}
