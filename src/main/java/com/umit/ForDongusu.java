package com.umit;

public class ForDongusu {

    public static void main(String[] args) {

        /**
         * for dongusu yapısı
         *
         * for ( baslangic degeri ; Bitis kosulu ; adim degisimi ) { kod blogu }
         * seklindedir.
         *
         * bir kod blogunu belirli bir sayıda ve üst üste calistirmak icin kullanılan bir döngüdür.
         *
         */

        int toplam=0;
        for (int i=0; i<=10 ; i++){  // int i=0 baslangic degeri tanimladik , i 10 dan buyuk
                                     // olasiya kadar bitis kosulu tanimlayip,adim degisimini +1 olarak girdik.
            toplam+=i;               // bu 1 den 10a kadar olan sayilarin toplamini bulmamizi sagladi.
        }
        System.out.println(toplam);


        int i=0;
        int toplam2=0;
        for (;i<11;i++){             // int i=0 disarda tanimlayip for dongusu icinde tanimlama yapmadan kullanabiliriz.
            toplam2+=i;              // ustteki ornekle ayni sonuca ulasiriz.
        }
        System.out.println(toplam2);

        /**
         * for dongusu ic ice kullanim ozelligine sahiptir.Cok tercih edilmesede bazi orneklerde kullanmamiz gerekebilir.
         * karmasikligi artirdigi icin tercih edilmez.
         */

        for (int t = 1; t <= 5; t++) {
            for (int j = 1; j <= t; j++) {
                System.out.print("*");       //bu ornekte ic ice for kullanarak "*" ifadesiyle ucgen seklini elde ettik.
            }
            System.out.println();
        }

        /**
         * Bazı durumlarda for dongusunun icine komut yazip for dongusune mudahale edebiliriz
         * break; komutu for dongusu icinde calistiginda dongu den cikilir
         * continue; komutu calistiginda for dongusunun o anki degerinden cikilir ve devam edilir.
         *
         */
        toplam=0;                //toplam degiskeni ustte 55 degerini aldigi icin 0 ladik.
        for (i=0;i<=10;i++){
            if (i==3) break;  //i=3 oldugu zaman bu komut calistigi anda donguden cikilir ve 3 e kadar olan toplami buluruz.
            toplam+=i;
        }
        System.out.println(toplam);

        toplam=0;
        for (i=0;i<=10;i++){
            if (i==3) continue;  //i=3 oldugu zaman bu komut calistigi anda 3 isleme alinmaz ve 4ten devam ederiz.
            toplam+=i;           //1 10 arasi 3 haric sayilarin toplamini buluruz.
        }
        System.out.println(toplam);



    }//main sonu

}//class sonu


































