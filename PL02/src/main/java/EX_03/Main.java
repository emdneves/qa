package EX_03;

public class Main {
    public static void main(String[] args) {
        Ano ano = new Ano(2023);
        Mes[] meses = ano.getMeses();
        Mes primeiroMes = meses[0];
        Dia[] dias = primeiroMes.getDias();
        Dia primeiroDia = dias[0];
        primeiroDia.adicionarTarefa("Consulta Ortopedista");
        primeiroDia.adicionarTarefa("Entrega Trabalho Prático de QA");
        System.out.println("Ano: " + ano.getAno());
        for (Mes mes : meses) {
            System.out.println("Mês: " + mes.getNome());
            for (Dia dia : mes.getDias()) {
                System.out.println("Dia: " + dia.getDia());
                System.out.println("Tarefas:");
                for (String tarefa : dia.getTarefas()) {
                    System.out.println("- " + tarefa);
                }
            }
        }
    }
}
