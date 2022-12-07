package projectguisdl;

public class Larik {
    public static void cetak(Object[] listlagu) {
        
        for (int i = 0; i < listlagu.length; i++) {
            
            System.out.println(listlagu[i]);
        }
    }
   public static int binarySearch(Object[] daftarLagu, Object kunci) {
       Larik.bubleSort(daftarLagu);
        

        int indexAwal = 0;
        int indexAkhir = daftarLagu.length - 1;
        int indexTengah;

        while (indexAwal <= indexAkhir) {
            indexTengah = (indexAwal + indexAkhir) / 2;
            if (((Comparable) daftarLagu[indexTengah]).compareTo(kunci) == 0) {
                return indexTengah;
            } else {
                if (((Comparable) daftarLagu[indexTengah]).compareTo(kunci) == 1) {
                    indexAkhir = indexTengah - 1;
                } else {
                    indexAwal = indexTengah + 1;
                }
            }
        }
        return -1;
    }

    public static void swap(Object[] listlagu, int a, int b) {
        Object c;

        c = listlagu[a];
        listlagu[a] = listlagu[b];
        listlagu[b] = c;
    }

    public static Object[] bubleSort(Object[] listlagu) { //langkah 0
        for (int iterasi = 1; iterasi <= (listlagu.length - 1); iterasi++) { //langkah 2
            for (int elemen = 0; elemen <= (listlagu.length - 1 - iterasi); elemen++) { //langkah 3
                if (((Comparable) listlagu[elemen]).compareTo(listlagu[elemen + 1]) > 0) { //langkah 3
                    swap(listlagu, elemen, elemen + 1);
                }
            }

        }

        return listlagu;
    }
 
    public static void toString(Object[] listlagu) {
        for (int i = 0; i < listlagu.length; i++) {
            System.out.print(listlagu[i] + "\n");
        }
    }

    static Object[] bubleSort(LinkedListObject daftarLagu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}