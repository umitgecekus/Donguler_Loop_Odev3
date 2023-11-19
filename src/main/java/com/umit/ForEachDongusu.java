package com.umit;

public class ForEachDongusu {
    public static void main(String[] args) {

        /**
         * for-each dongusu array ya da collection ogeleri uzerinde dongu yapar.
         */

        String[]a={"Ankara","Istanbul","Izmir"};
        for (String str:a) System.out.println(str);   //for each ile dizi icinde ki elemanlari yazdirdik
    /**
     * for-each dongusunun kac kez donecegini belirten ifade (string str : a) dir. Bu ifade String
     * tipinden str degişkenini tanimlamakta ve str degiskeni a array'inin ögelerine eslesmektedir. Dolayisiyla, a
     * array'inin bütün bilesenleri sirayla yazilmaktadir.
     */

        /**
         * 6! degerigini foreach ve char kullanarak bulalim.
         *
         */
        int i = 1, t = 1;
        char[] ch = { 'A', 'n', 'k', 'a', 'r', 'a' };
        for (char c : ch) {
            i = i * t;
            t++;
        }
        System.out.println(i);

    }//main sonu

}//class sonu
