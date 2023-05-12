package trabalho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BeeCrowd1091Test {
    
    @Test
    public void coordNETest(){
        BeeCrowd1091 bc = new BeeCrowd1091();
        String result = bc.calculaPosicao(1,2,2,4,4);
        assertEquals("NE", result);
    }

    @Test
    public void coordSETest(){
        BeeCrowd1091 bc = new BeeCrowd1091();
        String result = bc.calculaPosicao(1,2,2,4,2);
        assertEquals("SE", result);
    }

    @Test
    public void coordNOTest(){
        BeeCrowd1091 bc = new BeeCrowd1091();
        String result = bc.calculaPosicao(1,2,2,2,4);
        assertEquals("NO", result);
    }

    @Test
    public void coordSOTest(){
        BeeCrowd1091 bc = new BeeCrowd1091();
        String result = bc.calculaPosicao(1,4,4,2,2);
        assertEquals("SO", result);
    }

    @Test
    public void coordDividaTest(){
        BeeCrowd1091 bc = new BeeCrowd1091();
        String result = bc.calculaPosicao(1,2,2,2,2);
        assertEquals("Divisa", result);
    }
}
