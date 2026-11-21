public class Main {

    public static void main(String[] args) {

        // Esercizio base
        int[] numeri = {10, 20, 30, 40, 50};

        Ciclabile ciclabile = new Ciclabile(numeri);

        System.out.println("ESERCIZIO BASE");

        while (ciclabile.hasAncoraElementi()) {
            System.out.println(ciclabile.getElementoSuccessivo());
        }

        // Bonus
        System.out.println("BONUS");

        Ciclabile altroCiclabile = new Ciclabile();

        altroCiclabile.addElemento(100);
        altroCiclabile.addElemento(200);
        altroCiclabile.addElemento(300);

        while (altroCiclabile.hasAncoraElementi()) {
            System.out.println(altroCiclabile.getElementoSuccessivo());
        }
    }
}
