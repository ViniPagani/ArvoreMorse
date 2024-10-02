# Implementação de uma Árvore Morse

## Classe Node
Começamos definindo os nodes na classe `Node`, que são:
- `char caractere`
- `Node filhoEsquerdo`
- `Node filhoDireito`

No construtor, definimos os valores iniciais:
java
this.caractere = '\0';
this.filhoEsquerdo = null;
this.filhoDireito = null;


---

## Classe ArvoreMorse
Na classe `ArvoreMorse`, definimos um Node chamado `raiz`.

### Método Inserir
O método `inserir` recebe uma `String` (codigoMorse) e um `char` (caractere).

1. Inicia o nó raiz como o atual.
2. Criamos um laço `for` que percorre cada `char` do código morse e verifica:
   - Se for igual a `'.'`:
     - Percorre para o nó da esquerda.
     - Se o nó da esquerda não existir, ele cria um nó novo e o define como o nó atual.
   - Se for igual a `'-'`:
     - Percorre para o nó da direita.
     - Se o nó da direita não existir, ele cria um nó novo e o define como o nó atual.
3. Ao final da sequência do código morse, atribui o caractere ao nó correspondente.

### Método Buscar
O método `buscar` recebe uma `String` (codigoMorse).

1. Inicia o nó raiz como o atual.
2. Criamos um laço `for` que percorre cada `char` do código morse e verifica:
   - Se for igual a `'.'`:
     - Define `noAtual` como o nó da esquerda.
   - Se for igual a `'-'`:
     - Define `noAtual` como o nó da direita.
3. Ao final:
   - Se `noAtual` for igual a `null`, retorna `'\0'`.
   - Caso contrário, retorna o caractere correspondente ao `noAtual`.

---

## Métodos de Percurso

### Pré-Ordem
O método começa processando o nó atual e imprime o caractere associado a ele. Em seguida:
1. Move-se para o filho da esquerda, se existir.
2. Após o filho esquerdo, move-se para o filho direito, se existir.

### In-Ordem
1. Primeiro, o método visita o filho da esquerda, se existir.
2. Em seguida, processa o nó atual e imprime o caractere associado a ele.
3. Por último, move-se para o filho da direita, se existir.

### Pós-Ordem
1. O método primeiro visita o filho da esquerda, se existir.
2. Depois, move-se para o filho da direita, se existir.
3. Por fim, processa o nó e imprime o caractere associado a ele.

---

## Classe Main

Na classe `Main`, criamos uma árvore morse chamada `arvoreMorse`. Em seguida, inserimos todas as letras do alfabeto com seus respectivos códigos Morse, por exemplo:
java
arvoreMorse.inserir(".-", 'A');
arvoreMorse.inserir("-...", 'B');
arvoreMorse.inserir("-.-.", 'C');
arvoreMorse.inserir("-..", 'D');
// ...


Após inserir todo o alfabeto, temos um menu com 5 diferentes opções:

### 1) Inserir código morse e caractere
- Pede para o usuário digitar um código morse, que será salvo na variável `morse`.
- Pede para o usuário digitar um caractere, que será salvo na variável `caractere`.
- Em seguida, chamamos o método `inserir`, passando as variáveis `morse` e `caractere` como argumentos.
- Fazemos o print que o caractere e código morse foram inseridos com sucesso.

### 2) Buscar a partir do código morse
- Pede para o usuário digitar um código morse para a busca, que é salvo na variável `codigo`.
- Em seguida, usamos o método `buscar` com a variável `codigo` como argumento e salvamos o resultado em uma variável `char resultado`.
  - Se o resultado for diferente de `'\0'`, imprime a letra correspondente ao resultado.
  - Caso contrário, imprime que o código morse não foi encontrado.

### 3) Exibir Pré-Ordem
- Chama o método `preOrdem` presente na classe `ArvoreMorse`, passando a raiz da árvore como argumento.

### 4) Exibir In-Ordem
- Chama o método `inOrdem` presente na classe `ArvoreMorse`, passando a raiz da árvore como argumento.

### 5) Exibir Pós-Ordem
- Chama o método `posOrdem` presente na classe `ArvoreMorse`, passando a raiz da árvore como argumento.
