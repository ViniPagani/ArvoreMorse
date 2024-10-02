-----------------------------------------------------------------------------------------------------
* Começamos defindo os nodes na classe Node que são eles: 
Char caractere
Node filhoEsquerdo
Node filho Direito

Fazemos o contrutor definindo o valor
this.caractere = '\0';
this.filhoEsquerdo = null;
this.filhoDireito = null;

-----------------------------------------------------------------------------------------------------

* Na classe ArvoreMorse definimos um Node chamado raiz

------------------------------------------- Metodo Inserir ------------------------------------------

Fazemos um metodo de inserir onde ele recebe uma String (codigoMorse) e um Char (caractere)
Inicia o nó raiz como o atual
Criamos um laço for que verifica cada Char do codigo morse e verifica:
Se for igual a '.' 
  Percorre para o nó da esquerda
  Se o nó da esquerda não existir ele cria um nó novo e define ele como nó atual
Se for igual a '-' 
  Percorre para o nó da direita 
  Se o nó da direita não existir ele cria um nó novo e define ele como nó atual
Ao final da sequencia do código morse ele atribui o caractere ao nó correspondente 

------------------------------------------- Metodo Buscar --------------------------------------------

Fazemos um metodo de busca onde ele recebe uma String (codigoMorse)
Inicia o nó raiz como o atual
Criamos um laço for que verifica cada Char do codigo morse e verifica:
Se for igual a '.' 
  Define o noAtual como o nó da esquerda
Se for igual a '-' percorre para o nó da direita 
  Define o noAtual como o nó da direita
Ao final ele verifica se o noAtual for igual a null ele retorna '\0'
Se não for ele retorna o caractere correspondente ao noAtual

--------------------------------------------- Pre Ordem ---------------------------------------------

O método começa processando o nó atual e imprime o caractere associado a ele
Em seguida se move para o filho da esquerda se existir 
Após o filho esquerdo o método se move para o filho direito se existir

--------------------------------------------- In Ordem ----------------------------------------------

Primeiro o método visita o filho da esquerda
Em seguida processa o nó atual e imprime o caractere associado a ele
Por último ele se move para o filho da direita se existir

--------------------------------------------- Pos Ordem ---------------------------------------------

O método primeiro visita o filho da esquerda
Depois se move para o filho da direita
Por fim processa o nó e imprime o caractere associado a ele

-----------------------------------------------------------------------------------------------------

*Na classe Main criamos uma arvore morse chamada arvoreMorse
Em seguica inserimos todas as letras do alfabeto com os respectivos codigos morses, ex:
    arvoreMorse.inserir(".-", 'A');
    arvoreMorse.inserir("-...", 'B');
    arvoreMorse.inserir("-.-.", 'C');
    arvoreMorse.inserir("-..", 'D');
    .
    .
    .
Apos inserir todo o alfabeto temos um menu com 5 diferentes opções:

1) Inserir código morse e caractere:
  Pede para o usuario digitar um código morse que vai ser salvo na variavel morse;
  Pede para o usuario digitar um caractere que vai ser salvo na variavel caractere;
  Em seguida chamamos o método de inserir e passamos com o argumento a varivel morse e caractere.
  Fazemos o print que o caracter e código morse foram inseridos com sucesso.
  
2) Busca a partir do código morse:
  Pede para o usuario digitar um código morse para a busca que é salvo na variavel codigo;
  Em seguida usamos o método buscar com a variavel codigo como argumento e salvamos em uma variavel char resultado;
  Se o resultado é diferente de '\0'
    Fazemos o print da letra correspondente ao resultado
  Se não
    Fazemos o print que o código morse não foi encontrado
    
3) Exibir Pre Ordem:
   Chama o método Pre Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento
   
4) Exibir In Ordem:
  Chama o método In Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento

5) Exibir Pos Ordem:
  Chama o método Pos Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento
