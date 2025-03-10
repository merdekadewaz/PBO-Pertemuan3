/*  Nama File   : AngkaSial.java
    Pembuat     : Merdeka Dewa / 24060123140122
    Tanggal     : 08 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            //as.cobaAngka(10);
            as.cobaAngka(13);
            //as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

//PERTANYAAN: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//JAWABAN: baris 12 tidak dieksekusi karena sebelum mencapainya program sudah melemparkan eksepsi dan baris 21 dieksekusi karena ada blok catch yang menangani eksepsi dan mengeksekusi perintah di dalamnya
