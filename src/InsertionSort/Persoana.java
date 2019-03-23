package InsertionSort;

public class Persoana {
    private String Prenume;
    private String Nume;
    private int varsta;

    public Persoana(String last, String first, int a) {
        Prenume = last;
        Nume = first;
        varsta = a;
    }

    public void afisarePersoana() {
        System.out.print(" Prenumele persoanei este: " + Prenume);
        System.out.print(" ,Numele persoanei : " + Nume);
        System.out.println(" ,Varsta persoanei : " + varsta);
    }

    public String preiaPrenume() {
        return Prenume;
    }
}

class CreareLista {
    private Persoana[] a;
    private int nElems;

    public CreareLista(int max) {
        a = new Persoana[max];
        nElems = 0;
    }

    public void inserarePersoana(String last, String first, int varsta) {
        a[nElems] = new Persoana(last, first, varsta);
        nElems++;
    }

    public void afisare() {
        for (int j = 0; j < nElems; j++)
            a[j].afisarePersoana();
        System.out.println("");
    }

    public void Sortare() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            Persoana temp = a[out];
            in = out;
            while (in > 0 && a[in - 1].preiaPrenume().compareTo(temp.preiaPrenume()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
    class SortarePersoane{
        public static void main (String[] args){
            int maxSize=100;
            CreareLista arr= new CreareLista(maxSize);
            arr.inserarePersoana("Ionescu","Alin",24);
            arr.inserarePersoana("Ionescu","Aladin",59);
            arr.inserarePersoana("Silvestru","Vasile",57);
            arr.inserarePersoana("Andreescu","Ivan",37);
            arr.inserarePersoana("Stamate","Dan",43);
            arr.inserarePersoana("Popescu","Ion",21);
            arr.inserarePersoana("Popescu","Ionut",29);
            arr.inserarePersoana("Anghelescu","Lucia",22);

            System.out.println("Inainte de sortare ");
            arr.afisare();
            arr.Sortare();
            System.out.println("Dupa sortare ");
            arr.afisare();
        }
    }


