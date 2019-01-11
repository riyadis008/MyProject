package Universitas;
import java.util.*;

public class Mahasiswa extends UnivMember {
    //public static HashMap<Integer, Mahasiswa> dataMahasiswa = new HashMap<>();
    private int npm;

    /**
     * Getter NPM Mahasiswa
     * @return NPM Mahasiswa
     */
    public int getNpm(){
        return this.npm;
    }

    /**
     * Construct objek mahasiswa
     * @param nama nama mahasiswa
     * @param umur umur mahasiswa
     */
    public Mahasiswa(String nama, int umur, int npm){
        super(nama,umur);
        this.npm = npm;
    }




}
