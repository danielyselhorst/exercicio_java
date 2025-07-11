import java.util.Scanner;

public class JogoDaVelha {

    static char[][] tabuleiro = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };

    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            imprimirTabuleiro();
            int linha, coluna;
            while (true) {
                System.out.print("Jogador " + jogadorAtual + ", informe linha: ");
                linha = sc.nextInt();
                System.out.print("Jogador " + jogadorAtual + ", informe coluna: ");
                coluna = sc.nextInt();
                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    break;
                } else {
                    System.out.println("Posição inválida ou já ocupada. Tente novamente.");
                }
            }

            if (verificarVencedor()) {
                imprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("Empate!");
                jogoAtivo = false;
            } else {
                if (jogadorAtual == 'X')
                    jogadorAtual = 'O';
                else
                    jogadorAtual = 'X';
            }
        }

        sc.close();
    }

    static void imprimirTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2)
                    System.out.print(" | ");
            }
            if (i < 2)
                System.out.print("\n -----------\n");
        }System.out.println();
    }

    static boolean verificarVencedor() {
        // Verifica todas as linhas
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[0][1] == jogadorAtual && tabuleiro[0][2] == jogadorAtual) {
            return true;
        } else if (tabuleiro[1][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
                && tabuleiro[1][2] == jogadorAtual) {
            return true;
        } else if (tabuleiro[2][0] == jogadorAtual && tabuleiro[2][1] == jogadorAtual
                && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }

        // Verifica todas as colunas
        else if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][0] == jogadorAtual
                && tabuleiro[2][0] == jogadorAtual) {
            return true;
        } else if (tabuleiro[0][1] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
                && tabuleiro[2][1] == jogadorAtual) {
            return true;
        } else if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][2] == jogadorAtual
                && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }

        // Verifica diagonais
        else if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
                && tabuleiro[2][2] == jogadorAtual) {
            return true;
        } else if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
                && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }

        return false;
    }

    static boolean verificarEmpate() {
        if (tabuleiro[0][0] == ' ')
            return false;
        else if (tabuleiro[0][1] == ' ')
            return false;
        else if (tabuleiro[0][2] == ' ')
           return false;
        else if (tabuleiro[1][0] == ' ')
            return false;
        else if (tabuleiro[1][1] == ' ')
            return false;
        else if (tabuleiro[1][2] == ' ')
            return false;
        else if (tabuleiro[2][0] == ' ')
            return false;
        else if (tabuleiro[2][1] == ' ')
            return false;
        else if (tabuleiro[2][2] == ' ')
            return false;
        else
            return true;
    }

}
