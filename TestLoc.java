/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testloc;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TestLoc {
    public static void main(String[] args) {
        Library ThuVien = new Library();

        ThuVien.docListtuFile("Books.txt");

        Scanner sc = new Scanner(System.in);

      int choice;
    do {
        System.out.println("\n Menu chuong trinh quan li thu vien: ");
        System.out.println("1. Them Sach");
        System.out.println("2. Xoa Sach");
        System.out.println("3. Muon Sach");
        System.out.println("4. Tra Sach");
        System.out.println("5. Hien thi danh sach");
        System.out.println("6. Luu Sach vao File");
        System.out.println("7. Doc sach tu file");
        System.out.println("8. Thoat ");
        System.out.print("Lua chon cua ban: ");
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhap Tieu de: ");
                String Tieude = sc.nextLine();
                System.out.print("Nhap Tac gia: ");
                String Tacgia = sc.nextLine();
                System.out.print("Nhap nam sang tac: ");
                int NamSangTac = Integer.parseInt(sc.nextLine());
                System.out.print("Do co phai sach dien tu khong? (co/khong): ");
                String isEBook = sc.nextLine();
                if (isEBook.equalsIgnoreCase("co")) {
                    System.out.println("Nhap dinh dang file: ");
                    String dinhdangFile = sc.nextLine();
                    System.out.println("Nhap kich thuoc file: ");
                    Double kichthuocFile = sc.nextDouble();

                    EBook SachDienTu = new EBook(Tieude, Tacgia, NamSangTac, dinhdangFile, kichthuocFile);
                    ThuVien.themBook(SachDienTu);
                }
                else {
                    Book sach1 = new Book(Tieude, Tacgia, NamSangTac);
                    ThuVien.themBook(sach1);
                }
                break;
                case 2:
                    System.out.println("Nhap Tieu de cuon sach ban muon xoa: ");
                    String xoa = sc.nextLine();
                    for(int i = 0; i < ThuVien.sachList.size(); i++) {
                        Book b = ThuVien.sachList.get(i);
                        if(b.getTieude().equalsIgnoreCase(xoa)) {
                            ThuVien.xoaBook(b);
                            System.out.println("Sach da xoa: " + b.getTieude());
                            break;
                        }
                    }
                break;
                case 3:
                    System.out.println("Chon Tieu de cuon sach ban muon muon: ");
                    String sachMuon = sc.nextLine();
                    sc.nextLine();
                    for(int i = 0; i < ThuVien.sachList.size(); i++) {
                        Book b = ThuVien.sachList.get(i);
                        if(b.getTieude().equalsIgnoreCase(sachMuon)) {
                            ThuVien.MuonBook(b, "User", LocalDate.now());
                            sc.nextLine();
                            break;
                        }
                    }
                break;
                case 4:
                    System.out.println("Chon Tieu de cuon sach bn muon tra: ");
                    String traSach = sc.nextLine();
                    sc.nextLine();
                    for(int i = 0; i < ThuVien.sachList.size(); i++) {
                        Book b = ThuVien.sachList.get(i);
                        if(b.getTieude().equalsIgnoreCase(traSach)) {
                            ThuVien.TraBook(b, "User", LocalDate.now() );
                            sc.nextLine();
                            break;
                        }
                    }
                break;
                case 5:
                    ThuVien.hienthiBook();
                break;
                case 6:
                    ThuVien.luuBookvaoFile("Books.txt");
                break;
                case 7:
                    ThuVien.docListtuFile("Books.txt");
                break;
                case 8:
                    System.out.println("Thoat khoi chuong trinh. Chao tam biet!");
                break;
            default:
                    System.out.println("Lua chon cua bn khong phu hop.\n Lam on chi chon tu 1 den 8.");
                break;      
        }
    } 
        while (choice != 8);
            sc.close();  
    }   
    }




