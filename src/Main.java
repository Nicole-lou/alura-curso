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

    // convertendo valores
        // O java possui palavras reservadas que não podem
        // ser utilizadas fora de suas atribuições
        // ex. int class

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
        // deu 4 estrelas




    }

}
