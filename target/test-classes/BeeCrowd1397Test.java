package trabalho;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BeeCrowd1397Test {

    @Test
    public void testarObterVencedor() {
        BeeCrowd1397 bc = new BeeCrowd1397();

        int[] jogadasJogador1 = { 1, 2, 3 };
        int[] jogadasJogador2 = { 2, 3, 1 };

        int resultadoEsperado = 1;
        int resultadoAtual = bc.obterVencedor(jogadasJogador1, jogadasJogador2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testarEmpate() {
        BeeCrowd1397 bc = new BeeCrowd1397();

        int[] jogadasJogador1 = { 1, 2, 3 };
        int[] jogadasJogador2 = { 3, 2, 1 };

        int resultadoEsperado = 0;
        int resultadoAtual = bc.obterVencedor(jogadasJogador1, jogadasJogador2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
}
