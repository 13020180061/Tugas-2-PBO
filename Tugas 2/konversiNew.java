/*
        Nama    : St.Hatijah H.Ilyas
	Tanggal : 26 Maret 2020
	Waktu	: 20.58	
*/

import java.util.Scanner;
public class konversiNew{
	public static void main(String[] args)
	{
		int detik, jam, menit, sisa1, sisa2;

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Detik : ");
		detik = input.nextInt();
		
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;

		System.out.println("Konversi waktu dari " + detik + " Detik = " + jam + " Jam : "
		+ menit + " Menit : " + sisa2 + " Detik");
	}
}