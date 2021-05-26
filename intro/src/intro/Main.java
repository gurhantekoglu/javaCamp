package intro;

public class Main {

	public static void main(String[] args) {

		// camelCase
		//
		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü fotoðrafý");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi fotoðrafý");
		} else {
			System.out.println("Dolar deðiþmedi fotoðrafý");
		}

		String[] krediler = { "Hýzlý Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi", "MSB Kredisi",
				"MEB Kredisi", "Kültür Bakanlýðý Kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		// Bellekte veriler adreslerde tutulur.
		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);

		// ----------------------------------
		int sayi3 = 30;
		int sayi4 = 25;
		int sayi5 = 45;
		int enBuyuk = sayi3;

		if (enBuyuk < sayi4) {
			enBuyuk = sayi4;
		}

		if (enBuyuk < sayi5) {
			enBuyuk = sayi5;
		}

		System.out.println("En büyük = " + enBuyuk);

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// For
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("For Döngüsü Bitti");

		// While
		int i = 2;

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While Döngüsü Bitti");

		// Do-While
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Do-While Döngüsü Bitti");

		System.out.println("---");

		String[] ogrenciler = new String[4];

		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		for (int g = 0; g < ogrenciler.length; g++) {
			System.out.println(ogrenciler[g]);
		}

		System.out.println("---");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		System.out.println("---");

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}

		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		for (int b = 0; b <= 2; b++) {
			System.out.println("---");
			for (int c = 0; c <= 2; c++) {
				System.out.println(sehirler[b][c]);
			}
		}

		int number = 2;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean intPrime = true;

		if (number == 1) {
			System.out.println("Sayý asal deðildir");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayý");
			return;
		}

		for (int z = 2; z < number; z++) {
			if (number % z == 0) {
				intPrime = false;
			}
		}

		if (intPrime) {
			System.out.println("Sayý asaldýr");
		} else {
			System.out.println("Sayý asal deðildir");
		}

		char harf = 'ý';

		switch (harf) {
		case 'a':
		case 'ý':
		case 'o':
		case 'u':
			System.out.println("Kalýn sesli harf");
			break;
		default:
			System.out.println("Ýnce sesli harf");
		}

		int aNumber = 6;
		int aTotal = 0;

		if (aNumber == 1) {
			System.out.println("Mükemmel sayý deðildir");
			return;
		}

		if (aNumber < 1) {
			System.out.println("Geçersiz sayý");
			return;
		}

		for (int num = 1; num < aNumber; num++) {
			if (aNumber % num == 0) {
				aTotal += num;
			}
		}

		if (aTotal == aNumber) {
			System.out.println("Mükemmel sayýdýr");
		} else {
			System.out.println("Mükemmel sayý deðildir");
		}

		int num1 = 220;
		int num2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int Number = 1; Number < num1; Number++) {
			if (num1 % Number == 0) {
				total1 += Number;
			}
		}

		for (int Number = 1; Number < num2; Number++) {
			if (num2 % Number == 0) {
				total2 += Number;
			}
		}

		if (num1 == total2 && num2 == total1) {
			System.out.println("Bu iki sayý arkadaþtýr");
		} else {
			System.out.println("Bu iki sayý arkadaþ deðildir");
		}

		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int searchNumber = 5;
		boolean isThere = false;
		
		for(int nu: numbers) {
			if(nu==searchNumber) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Sayý mevcuttur");
		} else {
			System.out.println("Sayý mevcut deðildir");
		}

	}

}
