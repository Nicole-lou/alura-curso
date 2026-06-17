public class condicional {
    static void main() {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");

        } else {
            System.out.println("Filme retrô que vale a pena de assistir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme não liberado, não tem o plano plus");
        }
       
    }

}
