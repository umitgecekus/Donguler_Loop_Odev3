package com.umit;

public class Do_WhileDongusu {

    public static void main(String[] args) {

        /**
         * Do While dongu yapisi
         *
         * do{kod blogu}
         * while(boolean);
         * seklindedir. Noktali virgul kullanimi onemlidir.While dan sonra konulmasi gerekir.
         *
         * Bu yapi While dongusune benzer ama once kod blogu calisir sonra (boolean) denetlenir.
         * boolean false olasiya kadar do kod blogu calismaya devam eder.
         * boolean degerini gerekli yerlerde degistirmezsek sonsuza kadar donen hatali kodlar
         * yazabiliriz.
         *
         *
         */

        //Diger dongulerde ki ornegimizi doWhile ile de cozebiliriz.

        int i=1;
        int toplam=0;
        do {
            toplam+=i;
            i++;
        }while (i<11);
        System.out.println(toplam);

    }//main sonu


}//class sonu
