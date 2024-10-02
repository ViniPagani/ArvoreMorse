public class ArvoreMorse {
     Node raiz;

    public ArvoreMorse() {
        raiz = new Node(); //Raiz como novo nó
    }

    //Método para inserir um caractere
    public void inserir(String codigoMorse, char caractere) {
        Node noAtual = raiz;

        //Percorre o código Morse
        for (char simbolo : codigoMorse.toCharArray()) { //percorre toda a string de codigo inserido
            if (simbolo == '.') { //Se simbolo for igual a '.' ele vai para esquerda
                if (noAtual.filhoEsquerdo == null) { //Se o nó da esquerda não existir
                    noAtual.filhoEsquerdo = new Node(); //Cria um novo Nó
                }
                noAtual = noAtual.filhoEsquerdo; //Nó atual filho da esquerda
            }

            else if (simbolo == '-') { //Se simbolo for igual a '-' ele vai para direita
                if (noAtual.filhoDireito == null) { //Se o nó da direita nao existir
                    noAtual.filhoDireito = new Node(); //Cria um novo nó
                }
                noAtual = noAtual.filhoDireito; //Nó atual filho da direita
            }
        }
        //Ao final da sequência atribui o caractere ao nó correspondente
        noAtual.caractere = caractere;
    }

    //Método para buscar um caractere através do código Morse
    public char buscar(String codigoMorse) {
        Node noAtual = raiz; //inicia a busca pelo nó raiz

        //Percorre o código Morse
        for (char simbolo : codigoMorse.toCharArray()) {
            if (simbolo == '.') { //Se simbolo for '.' se move para esquerda
                noAtual = noAtual.filhoEsquerdo;
            }

            else if (simbolo == '-') { //Se simbolo for '-' se move para direita
                noAtual = noAtual.filhoDireito;
            }

            //Se nó for nulo o código é inválido
            if (noAtual == null) {
                return '\0'; //Retorna caractere nulo
            }
        }
        return noAtual.caractere; //Retorna o caractere encontrado
    }

    //Print Pre Ordem
    void preOrdem(Node posicao){
        System.out.print(" " + posicao.caractere);
        if (posicao.filhoEsquerdo != null){
            preOrdem(posicao.filhoEsquerdo);
        }
        if (posicao.filhoDireito != null){
            preOrdem(posicao.filhoDireito);
        }
    }

    //Print In Ordem
    void inOrdem(Node posicao){
        if (posicao.filhoEsquerdo != null){
            inOrdem(posicao.filhoEsquerdo);
        }
        System.out.print(" " + posicao.caractere);
        if (posicao.filhoDireito != null){
            inOrdem(posicao.filhoDireito);
        }
    }

    //Print Pos Ordem
    void posOrdem(Node posicao){
        if (posicao.filhoEsquerdo != null){
            posOrdem(posicao.filhoEsquerdo);
        }
        if (posicao.filhoDireito != null){
            posOrdem(posicao.filhoDireito);
        }
        System.out.print(" " + posicao.caractere);
    }
}