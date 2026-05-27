class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Screen match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 9.7) /3;
        System.out.println(media);
        String sinopseDoFilme;
        sinopseDoFilme = """
                Sobre o filme:
                Filme Top Gun
                Filme de Aventura
                Super recomendo
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopseDoFilme);



    }

}
