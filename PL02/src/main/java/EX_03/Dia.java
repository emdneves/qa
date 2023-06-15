package EX_03;

import java.util.ArrayList;
public class Dia {
    private int dia;
    private ArrayList<String> tarefas;
    public Dia(int dia) {
        this.dia = dia;
        this.tarefas = new ArrayList<>();
    }
    public int getDia() {
        return dia;
    }
    public ArrayList<String> getTarefas() {
        return tarefas;
    }
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }
}
