# Gestão de Turma em Java

## Descrição
Este projeto é um sistema simples em **Java** para gerenciar alunos e suas notas, utilizando **POO** (Programação Orientada a Objetos) e **Streams**.  
Ele permite:  
- Adicionar alunos com múltiplas notas.  
- Calcular a média de cada aluno e da turma.  
- Identificar alunos aprovados e reprovados (média ≥ 7).  
- Salvar os resultados em arquivos de texto (`notasTurma.txt`, `aprovados.txt`, `reprovados.txt`, `media.txt`).  

---

## Estrutura do Projeto

---

## Classes

### `Aluno`
- Representa um aluno com:
  - Nome (validação para não ser vazio e formatado corretamente)
  - Lista de notas (validação: notas entre 0 e 10)
- Método `media()` para calcular a média das notas do aluno.

### `Turma`
- Contém uma lista de objetos `Aluno`.
- Métodos:
  - `adicionar(Aluno aluno)` → adiciona um aluno à turma.
  - `imprimirNotas()` → imprime todas as notas no console e salva em arquivo.
  - `aprovado()` → filtra alunos com média ≥ 7, imprime e salva em arquivo.
  - `reprovado()` → filtra alunos com média < 7, imprime e salva em arquivo.
  - `mediaTurma()` → calcula a média geral da turma, imprime e salva em arquivo.

### `Main`
- Classe principal que:
  - Recebe entrada do usuário para criar alunos.
  - Adiciona alunos à turma.
  - Executa métodos de `Turma` para mostrar notas, aprovados, reprovados e média geral.

---


```bash
git clone https://github.com/USERNAME/NOME_DO_REPOSITORIO.git
