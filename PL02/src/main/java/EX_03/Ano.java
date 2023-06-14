package EX_03;

class Ano {
    private int ano;
    private Mes[] meses;
    public Ano(int ano) {
        this.ano = ano;
        this.meses = new Mes[12];
        for (int i = 0; i < 12; i++) {
            meses[i] = new Mes(obterNomeMes(i + 1));
        }
    }
    public int getAno() {
        return ano;
    }
    public Mes[] getMeses() {
        return meses;
    }
    private String obterNomeMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "";
        }
    }
}
