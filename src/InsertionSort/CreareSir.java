package InsertionSort;

public class CreareSir {
    private double[] a;
    private int NrElmts;

    public CreareSir(int max) {
        a = new double[max];
        NrElmts = 0;
    }

    public void introduElement(double value) {
        a[NrElmts] = value;
        NrElmts++;
    }

    public void afiseaza() {
        for (int i = 0; i < NrElmts; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < NrElmts; out++) {
            double temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}

class InsertionSortProgram {
    public static void main(String[] args) {
        int maxSize = 100;
        CreareSir vector = new CreareSir(maxSize);
        vector.introduElement(77);
        vector.introduElement(99);
        vector.introduElement(44);
        vector.introduElement(55);
        vector.introduElement(22);
        vector.introduElement(88);
        vector.introduElement(11);
        vector.introduElement(00);
        vector.introduElement(66);
        vector.introduElement(33);
        System.out.println("Sirul initial neordonat are urmatoarea forma: ");
        vector.afiseaza();
        vector.insertionSort();
        System.out.println("\nSirul ordonat are urmatoarea forma: ");
        vector.afiseaza();
    }
}



