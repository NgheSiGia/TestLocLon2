/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testloc;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;

public interface XuliEvent {
    void MuonBook (Book sach, String NguoiMuon, LocalDate NgayMuon);
    void TraBook (Book sach, String NguoiTra, LocalDate NgayTra);
}
