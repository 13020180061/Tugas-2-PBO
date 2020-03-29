/*
        Nama    : St.Hatijah H.Ilyas
	Tanggal : 26 Maret 2020
	Waktu	: 20.27	
*/

import java.util.Scanner;
public class mahasiswaNew{
	public static void main(String[] args)
	{
		String nim, nama, jurusan, fakultas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nim 	  : ");
		nim = input.nextLine();
		System.out.print("Masukkan Nama     : ");
		nama = input.nextLine();
		System.out.print("Masukkan Jurusan  : ");
		jurusan = input.nextLine();
		System.out.print("Masukkan Fakultas : ");
		fakultas = input.nextLine();

		System.out.println("\nNim      : " + nim);
		System.out.println("Nama     : " + nama);
		System.out.println("Jurusan  : " + jurusan);
		System.out.println("Fakultas : " + fakultas);
	}
}