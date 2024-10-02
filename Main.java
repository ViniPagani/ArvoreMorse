import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreMorse arvoreMorse = new ArvoreMorse();

        //Inserindo Letras na árvore
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

        /*Inserindo Numeros na árvore
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
        while (true) { //Buscar um caracetere pelo código
            System.out.println("");
            System.out.print("Menu:\n" +
                    "Digite 1 - Inserir codigo morse e caractere\n" +
                    "Digite 2 - Buscar a partir do codigo morse\n" +
                    "Digite 3 - Exibir Pre-Ordem\n" +
                    "Digite 4 - Exibir In-Ordem\n" +
                    "Digite 5 - Exibir Pos-Ordem\n" +
                    "Digite uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case(1): //Inserir
                    System.out.print("Digite o codigo morse: ");
                    String morse = scanner.nextLine(); //Salva o codigo morse na variavel morse

                    System.out.print("Digite o caractere: ");
                    char caractere = scanner.next().charAt(0); //Salva o caractere na variavel caractere

                    arvoreMorse.inserir(morse, caractere);
                    System.out.println("Caractere '" + caractere + "' inserido com sucesso no código morse '" + morse + "'.");
                    break;
                case(2): //Buscar a partir do codigo morse
                    System.out.print("Digite um código morse para buscar: ");
                    String codigo = scanner.nextLine();

                    char resultado = arvoreMorse.buscar(codigo); //Resultado igual a busca do código na árvore
                    if (resultado != '\0') { //Se for um caractere da print no resultado
                        System.out.println("Letra correspondente: " + resultado);
                    }
                    else {
                        System.out.println("Código Morse não encontrado.");
                    }

                    break;
                case(3): //Exibir Pre-Ordem
                    System.out.println("\nPre-Ordem:");
                    arvoreMorse.preOrdem(arvoreMorse.raiz);
                    break;

                case(4): //Exibir In-Ordem
                    System.out.println("\nIn-Ordem:");
                    arvoreMorse.inOrdem(arvoreMorse.raiz);
                    break;

                case(5): //Exibir Pos-Ordem
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