import koneksi.Database;
import model.Guru;
import model.Mapel;
import model.Siswa;

public class Main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Guru.tampilanInfo();
  Mapel.tampilanInfo();
  Siswa.tampilanInfo();
 }
}