import EX_03.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TarefasTest {
    private Ano ano1;
    private Mes mes1;
    private Dia dia1;
    private ArrayList<String> tarefas;

    @BeforeEach
    public void setUp() {
        ano1 = new Ano(1993);
        mes1 = new Mes("Maio");
        dia1 = new Dia(20);
        tarefas = new ArrayList<>();
    }

        @Test
        public void testGeters () {
            assertEquals(1993, ano1.getAno());
            assertEquals("Maio", mes1.getNome());
            assertEquals(20, dia1.getDia());
        }

        @Test
        public void testAdicionarTarefa () {
        tarefas.add(1, "abc");
        assertTrue(tarefas.contains("abc"));
        }

        @Test
        public void testGetTarefas(){
            tarefas.add(1, "abc");
            assertTrue(tarefas.contains("abc"));
        }

        @Test
        public void testGetDias() {
            assertEquals(31, mes1.size(getDias());
        }









}

