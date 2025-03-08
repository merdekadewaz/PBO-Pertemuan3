/*  Nama File   : ExceptionOnArray.java
    Pembuat     : Merdeka Dewa / 24060123140122
    Tanggal     : 08 - Maret - 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansi object array integer 
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
