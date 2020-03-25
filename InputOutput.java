import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  float tugas,uts,uas;

  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Halo, "+nama);

  System.out.print("Masukkan nilai Tugas anda: ");
  tugas = scanner.nextFloat();

  System.out.print("Masukkan nilai UTS anda: ");
  uts = scanner.nextFloat();

  System.out.print("Masukkan nilai UAS anda: ");
  uas = scanner.nextFloat();

  float jumlah = (tugas+uts+uas)/3;
  System.out.print("Total nilai rata rata anda: "+jumlah);
}
}