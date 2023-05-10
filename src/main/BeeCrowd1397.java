import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o número de rodadas: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int jogador1Pontos = 0;
            int jogador2Pontos = 0;
            int[] jogadasJogador1 = new int[n];
            int[] jogadasJogador2 = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Vez do jogador 1:");
                jogadasJogador1[i] = sc.nextInt();

                System.out.println("Vez do jogador 2:");
                jogadasJogador2[i] = sc.nextInt();
            }

            int vencedor = obterVencedor(jogadasJogador1, jogadasJogador2);
            if(vencedor == 0){
                System.out.println("Empatou");
            }
            else{
                System.out.println("O vencedor é o Jogador " + vencedor);
            }
        }

        sc.close();
    }

    public static int obterVencedor(int[] jogadasJogador1, int[] jogadasJogador2) {
        int jogador1Pontos = 0;
        int jogador2Pontos = 0;

        for (int i = 0; i < jogadasJogador1.length; i++) {
            if (jogadasJogador1[i] > jogadasJogador2[i]) {
                jogador1Pontos++;
            } else if (jogadasJogador2[i] > jogadasJogador1[i]) {
                jogador2Pontos++;
            }
        }

        if (jogador1Pontos > jogador2Pontos) {
            return 1;
        } else if (jogador2Pontos > jogador1Pontos) {
            return 2;
        } else {
            return 0; 
        }
    }
}
