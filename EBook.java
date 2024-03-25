/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testloc;

/**
 *
 * @author Admin
 */

public class EBook extends Book {
    private String dinhdangFile;
    private double kichthuocFile;

    public EBook(String Tieude, String Tacgia, int NamSangTac, String dinhdangFile, double kichthuocFile) {
        super(Tieude, Tacgia, NamSangTac);
        this.dinhdangFile = dinhdangFile;
        this.kichthuocFile = kichthuocFile;
    }

    public String getdinhdangFile() {
        return dinhdangFile;
    }
    public void setdinhdangFile(String dinhdangFile) {
        this.dinhdangFile = dinhdangFile;
    }

    public double getkichthuocFile() {
        return kichthuocFile;
    }
    public void setkichthuocFile(double kichthuocFile) {
        this.kichthuocFile = kichthuocFile;
    }

    @Override
    public String toString() {
        return "EBook [Tieu de = " + getTieude() + ", Tac gia = " + getTacgia() + ", Nam sang tac = "
         + getNam() + ", dinh dang File = " + dinhdangFile + ", kich thuoc File = " + kichthuocFile
         + ", Ngay muon= " + getNgayMuon() + ", Ngay tra = " + getNgayTra();
    }
    
}
