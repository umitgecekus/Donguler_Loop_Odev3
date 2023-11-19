package com.umit;

public class WhileDongusu {

    public static void main(String[] args) {

        /**
         * while dongu yapisi
         *
         *   while(boolean){kod blogu}
         * seklindedir.
         *
         * Belirli bir mantiksal deyim saglandigi sürece, belirli bir isin tekrarlanmasi isteniyorsa, bu denetim yapisi
         * kullanilir. Bu yapida, tekrarlamanin kaç kez olacagini önceden bilmek gerekmez.
         */
        //1den 10 a kadar olan sayilarin toplamini while ile bulalim.(Bitis noktasi bilindiginde genelde for dongusunu kullaniriz.)

        int sayac=1;
        int toplam=0;

        while (sayac<11){
            toplam+=sayac;
            sayac++;
        }
        System.out.println(toplam);



    }//main sonu

}//class sonu
