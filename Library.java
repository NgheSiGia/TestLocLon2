/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testloc;

/**
 *
 * @author Admin
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Library implements XuliEvent {

    ArrayList<Book> sachList;

    public Library() {
        this.sachList = new ArrayList<>();
    }

    public void themBook(Book sach) {
        sachList.add(sach);
    }

    public void xoaBook(Book sach) {
        sachList.remove(sach);
    }

    public void hienthiBook() {
        for (Book book : sachList) {
            System.out.println(book);
        }
    }
    
    private void xuat(Book sach){
        System.out.println("------------------------------------");
        System.out.println("Tieu De: " + sach.getTieude());
        System.out.println("Tac gia: " + sach.getTacgia());
        System.out.println("Nam sang tac: " + sach.getNam());
        System.out.println("Ngay muon: " + sach.getNgayMuon());
        System.out.println("Ngay Tra: " + sach.getNgayTra());
    }

    @Override
    public void MuonBook(Book sach, String NguoiMuon, LocalDate NgayMuon) {
        sach.setNgayMuon(LocalDate.now());
        System.out.println("Ngay Muon: " + sach.getNgayMuon());
        System.out.println(NguoiMuon + " muon cuon sach: " + sach.getTieude());
    }

    @Override
    public void TraBook(Book sach, String NguoiTra, LocalDate NgayTra) {
        sach.setNgayTra(LocalDate.now());
        System.out.println("Ngay Tra: " + sach.getNgayTra());
        System.out.println(NguoiTra + " tra cuon sach: " + sach.getTieude());
    }

    public void luuBookvaoFile(String filename) {
        try (BufferedWriter luu = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < sachList.size(); i++) {
                Book sach = sachList.get(i);
                luu.write("Tieu de: " + sach.getTieude() + " tac gia: " + sach.getTacgia() + " nam: " + sach.getNam());
                luu.newLine();
            }
            System.out.println("Danh sach Book duoc luu vao file: " + filename);
        } catch (IOException e) {
            System.out.println("Loi luu sach vao File: " + e.getMessage());
        }
    }

    public void docListtuFile(String filename) {
        try (BufferedReader doc = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = doc.readLine()) != null) {
                String[] parts = line.split("\\$");
                if (parts.length == 3) {
                    String tieude = parts[1];
                    String tacgia = parts[2];
                    int year = Integer.parseInt(parts[3]);
                    Book sach = new Book(tieude, tacgia, year);
                    sachList.add(sach);
                }
            }
            System.out.println("danh sach Book duoc doc tu file: " + filename);
        } catch (IOException e) {
            System.out.println("Loi doc sach tu File: " + e.getMessage());
        }
    }
}
