import EX_03.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class TarefasTest {

        @Test
        public void testMesGetNome() {
            Mes mes = new Mes("Janeiro");
            assertEquals("Janeiro", mes.getNome());
        }

        @Test
        public void testDiaGetDia() {
            Dia dia = new Dia(15);
            assertEquals(15, dia.getDia());
        }

        @Test
        public void testDiaAdicionarTarefa() {
            Dia dia = new Dia(20);
            dia.adicionarTarefa("Tarefa 1");
            dia.adicionarTarefa("Tarefa 2");
            assertEquals(2, dia.getTarefas().size());
        }

        @Test
        public void testAnoGetAno() {
            Ano ano = new Ano(2023);
            assertEquals(2023, ano.getAno());
        }

        @Test
        public void testAnoGetMeses() {
            Ano ano = new Ano(2023);
            Mes[] meses = ano.getMeses();
            assertEquals(12, meses.length);
        }

        @Test
        public void testObterNomeMes() {
            Ano ano = new Ano(2023);
            Mes mes = new Mes("janeiro");

        }
    }











