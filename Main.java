import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreMorse arvoreMorse = new ArvoreMorse(); //Criamos uma arvore morse chamada arvoreMorse

        //Inserimos todas as letras do alfabeto com os respectivos codigos morses
        arvoreMorse.inserir(".-", 'A');
        arvoreMorse.inserir("-...", 'B');
        arvoreMorse.inserir("-.-.", 'C');
        arvoreMorse.inserir("-..", 'D');
        arvoreMorse.inserir(".", 'E');
        arvoreMorse.inserir("..-.", 'F');
        arvoreMorse.inserir("--.", 'G');
        arvoreMorse.inserir("....", 'H');
        arvoreMorse.inserir("..", 'I');
        arvoreMorse.inserir(".---", 'J');
        arvoreMorse.inserir("-.-", 'K');
        arvoreMorse.inserir(".-..", 'L');
        arvoreMorse.inserir("--", 'M');
        arvoreMorse.inserir("-.", 'N');
        arvoreMorse.inserir("---", 'O');
        arvoreMorse.inserir(".--.", 'P');
        arvoreMorse.inserir("--.-", 'Q');
        arvoreMorse.inserir(".-.", 'R');
        arvoreMorse.inserir("...", 'S');
        arvoreMorse.inserir("-", 'T');
        arvoreMorse.inserir("..-", 'U');
        arvoreMorse.inserir("...-", 'V');
        arvoreMorse.inserir(".--", 'W');
        arvoreMorse.inserir("-..-", 'X');
        arvoreMorse.inserir("-.--", 'Y');
        arvoreMorse.inserir("--..", 'Z');

        /*Inserimos todas os números com os respectivos codigos morses
        arvoreMorse.inserir("-----", '0');
        arvoreMorse.inserir(".----", '1');
        arvoreMorse.inserir("..---", '2');
        arvoreMorse.inserir("...--", '3');
        arvoreMorse.inserir("....-", '4');
        arvoreMorse.inserir(".....", '5');
        arvoreMorse.inserir("-....", '6');
        arvoreMorse.inserir("--...", '7');
        arvoreMorse.inserir("---..", '8');
        arvoreMorse.inserir("----.", '9');
         */

        Scanner scanner = new Scanner(System.in);
        while (true) { //Menu com 5 diferentes opções:
            System.out.println("");
            System.out.print("Menu:\n" +
                    "Digite 1 - Inserir código morse e caractere\n" +
                    "Digite 2 - Buscar a partir do código morse\n" +
                    "Digite 3 - Exibir Pre-Ordem\n" +
                    "Digite 4 - Exibir In-Ordem\n" +
                    "Digite 5 - Exibir Pos-Ordem\n" +
                    "Digite uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case(1): //Inserir
                    System.out.print("Digite o codigo morse: ");
                    String morse = scanner.nextLine(); //Pede para o usuario digitar um código morse que vai ser salvo na variavel morse

                    System.out.print("Digite o caractere: ");
                    char caractere = scanner.next().charAt(0); //Pede para o usuario digitar um caractere que vai ser salvo na variavel caractere

                    arvoreMorse.inserir(morse, caractere); //Em seguida chamamos o método de inserir e passamos com o argumento a varivel morse e caractere
                    System.out.println("Caractere '" + caractere + "' inserido com sucesso no código morse '" + morse + "'.");
                    break;

                case(2): //Buscar a partir do codigo morse
                    System.out.print("Digite um código morse para buscar: ");
                    String codigo = scanner.nextLine(); //Pede para o usuario digitar um código morse para a busca que é salvo na variavel codigo;

                    char resultado = arvoreMorse.buscar(codigo); //Em seguida usamos o método buscar com a variavel codigo como argumento e salvamos em uma variavel char resultado;
                    if (resultado != '\0') { //Se o resultado é diferente de '\0', Fazemos o print da letra correspondente ao resultado
                        System.out.println("Letra correspondente: " + resultado);
                    }
                    else { //Se não, Fazemos o print que o código morse não foi encontrado
                        System.out.println("Código Morse não encontrado.");
                    }
                    break;

                case(3): //Chama o método Pre Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento
                    System.out.println("\nPre-Ordem:");
                    arvoreMorse.preOrdem(arvoreMorse.raiz);
                    break;

                case(4): //Chama o método In Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento
                    System.out.println("\nIn-Ordem:");
                    arvoreMorse.inOrdem(arvoreMorse.raiz);
                    break;

                case(5): //Chama o método Pos Ordem presente na classe ArvoreMorse passando a raiz da arvore como argumento
                    System.out.println("\nPos-Ordem");
                    arvoreMorse.posOrdem(arvoreMorse.raiz);
                    break;
                default:
                    System.out.println("invalido");
                    System.exit(0);
            }
        }
    }
}