/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testloc;

/**
 *
 * @author Admin
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private String Tieude;
    private String Tacgia;
    private int NamSangTac;
    private LocalDate NgayMuon;
    private LocalDate NgayTra;

    public Book(String Tieude, String Tacgia, int NamSangTac) {
    this.Tieude = Tieude;
    this.Tacgia = Tacgia;
    this.NamSangTac = NamSangTac;
    }

    public Book(String Tieude, String Tacgia, int NamSangTac, LocalDate NgayMuon, LocalDate NgayTra) {
        this.Tieude = Tieude;
        this.Tacgia = Tacgia;
        this.NamSangTac = NamSangTac;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }
    
    

    public String getTieude() {
        return Tieude;
    }
    public void setTieude(String Tieude) {
        this.Tieude = Tieude;
    }

    public String getTacgia() {
        return Tacgia;
    }
    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }

    public int getNam() {
        return NamSangTac;
    }
    public void setNam(int NamSangTac) {
        this.NamSangTac = NamSangTac;
    }

    public LocalDate getNgayMuon() {
        return NgayMuon;
    }
    public void setNgayMuon(LocalDate NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public LocalDate getNgayTra() {
        return NgayTra;
    }
    public void setNgayTra(LocalDate NgayTra) {
        this.NgayTra = NgayTra;
    }

   @Override
    public String toString() {
        return "Sach [Tieu de = " + Tieude + ", tac gia = " + Tacgia +
        ", Nam sang tac = " + NamSangTac + ", Ngay muon: " + NgayMuon + ", Ngay tra: " + NgayTra + "]";
    }
}
