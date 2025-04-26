package pertemuan5602;

/**
 *
 * @author Florentina Minovela
 * Tanggal 26 April 2025
 */
public class LuasPersegi {
    private int sisi;
    
    public LuasPersegi(int ss){
        this.sisi = ss;
    }
    
    public int HL(){
        int luas;
        luas = sisi * sisi;
        return luas;
    }
}
