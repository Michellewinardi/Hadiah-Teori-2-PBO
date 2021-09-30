// Hadiah2 Nomor 2
// Menginput data di Java Import class scanner ke program
import java.util.Scanner;
public class Hadiah2_2 {
	
	public static void main(String[] args) {
		
		int umur;
		String alamat,nama;
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Hadiah2 Nomor 2");
		System.out.println("\n");
		
		
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
	
		System.out.print("Masukkan Alamat Anda : ");
		alamat = input.nextLine();

		System.out.print("Masukkan Umur Anda : ");
		umur = input.nextInt();

		System.out.println("\n");
	
		System.out.println("Saudara : " + nama);
		System.out.println("Tinggal di : " + alamat);
		System.out.println("Berumur : " + umur + " tahun");

	}
	
	
}