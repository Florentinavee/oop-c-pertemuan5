package pertemuan5601;

/**
 *
 * @author Florentina Minovela
 * Tanggal 26 April 2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       buah apel = new buah();
       apel.warna = "hijau";
       apel.SetRasa("manis");
       
       System.out.printf("Warna apel diset %s\n", apel.warna);
       System.out.printf("Rasa apel diset %s\n", apel.GetRasa());
       
       buah anggur = new buah();
       anggur.warna = "ungu";
       anggur.SetRasa("manis");
       
       System.out.printf("Warna anggur diset %s\n", anggur.warna);
       System.out.printf("Rasa anggur diset %s\n", anggur.GetRasa());
       
       
    }
    
}


class buah {
    public String warna;
    private String rasa; 
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String GetRasa(){
        return this.rasa;
    }
}
