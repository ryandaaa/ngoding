package kelas_b;

public class Kelas_b {
    
    Kelas_b myObj = new Kelas_b();

    public static void main(String[] args) {
        System.out.println(pembalikKata("ryanda valents anakri"));
    }

    public static String pembalikKata(String kata) {
        StringBuilder editKata = new StringBuilder();
        editKata.append(kata);
        editKata.reverse();
        return editKata.toString();
    }
}
