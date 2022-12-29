package Generics.CodeChallenge1;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        ExchangeDesk ed = new ExchangeDesk();

        RON ron = new RON(10);
        System.out.println(ron);

        USD usd = ed.exchange(ron, USD.class);
        System.out.println(usd);

        EUR eur = ed.exchange(ron, EUR.class);
        System.out.println(eur);
    }
}
