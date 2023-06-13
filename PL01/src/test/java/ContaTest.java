import EX_07.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    private Conta conta;


    @BeforeEach
    public void setUp(){
        this.conta= new Conta("12345", "CR7", 1000);
    }

    @Test
    public void getNumeroContaTest(){
        conta.getNumeroConta();
        assertEquals("12345", conta.getNumeroConta());
        assertNotEquals("12345", conta.getNumeroConta());


    }
}
