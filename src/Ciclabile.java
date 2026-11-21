public class Ciclabile {

    private int[] elementi;
    private int indice;

    // Costruttore con array
    public Ciclabile(int[] elementi) {
        this.elementi = elementi;
        this.indice = 0;
    }

    // Costruttore senza parametri (bonus)
    public Ciclabile() {
        this.elementi = new int[0];
        this.indice = 0;
    }

    // Controlla se ci sono ancora elementi
    public boolean hasAncoraElementi() {
        return indice < elementi.length;
    }

    // Restituisce l'elemento successivo
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int elemento = elementi[indice];
            indice++;
            return elemento;
        }

        throw new IllegalStateException("Non ci sono altri elementi");
    }

    // Aggiunge un elemento (bonus)
    public void addElemento(int numero) {

        int[] nuovoArray = new int[elementi.length + 1];

        for (int i = 0; i < elementi.length; i++) {
            nuovoArray[i] = elementi[i];
        }

        nuovoArray[elementi.length] = numero;

        elementi = nuovoArray;
    }
}
