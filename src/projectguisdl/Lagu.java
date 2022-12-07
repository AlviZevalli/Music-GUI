package projectguisdl;

public class Lagu implements Comparable<Object> {

    private String judulLagu;
    private String artis;
    private String durasi;

    public Lagu() {
        this.judulLagu = null;
        this.artis = null;
        this.durasi = null;
    }

    public Lagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    public Lagu(String judulLagu, String artis, String durasi) {
        this.judulLagu = judulLagu;
        this.artis = artis;
        this.durasi = durasi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    public void setJudulLagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        return "Judul lagu = "+judulLagu;
    }
    

    @Override
    public int compareTo(Object the) {
        /* merupakan percabangan if. Percabangan ini akan dijalankan apabila
           nama = getNama
         */
        if (judulLagu.equalsIgnoreCase(((Lagu) the).getJudulLagu())) {
            // untuk mengembalikan 0 jika percabangan if diatas dijalankan 
            return 0;
        }// tutup kurung dari percabangan  if (nama.equalsIgnoreCase(((Mahasiswa)the).getNama()))
        /* merupakan percabangan else if. Percabangan ini akan dijalankan 
           apabila nama > getNama
         */ else if (judulLagu.compareToIgnoreCase(((Lagu) the).getJudulLagu()) >= 1) {
            // untuk mengembalikan 1 jika percabangan else id diatas dijalankan
            return 1;
        }// tutup kurung dari percabangan else if (nama.compareToIgnoreCase(((Mahasiswa)the).getNama())>= 1)
        /* merupakan percabangan else. Percabangan ini akan dijalankan apabila
           percabangan else if dan if diatas tidak dijalankan
         */ else {
            // untuk mereturn -1 jika percabangan else dijalankan  
            return -1;
        }// tutup kurung dari percabangan else 
    }// tutup kurung dari method public int compareTo(Object the)

}
