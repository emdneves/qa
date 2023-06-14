package EX_03;


class Mes {
    private String nome;
    private Dia[] dias;

    public Mes(String nome) {
        this.nome = nome;
        this.dias = new Dia[31];
        for (int i = 0; i < 31; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public String getNome() {
        return nome;
    }

    public Dia[] getDias() {
        return dias;
    }
}