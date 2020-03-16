/*
        Nama    : St.Hatijah H.Ilyas
	Tanggal : 15 Maret 2020
	Waktu	: 16.01	
*/

public class konversi{
	public static void main(String[] args)
	{
		int jam, menit,sisa1, sisa2;
		int detik = 142;
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;

		System.out.println("Konversi waktu dari " + detik + " Detik = " + jam + " Jam : "
		+ menit + " Menit : " + sisa2 + " Detik");
	}
}