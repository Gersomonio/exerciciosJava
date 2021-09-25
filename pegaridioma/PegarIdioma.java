package pegaridioma;

import java.util.Locale;

public class PegarIdioma {
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        String lang = locale.getDisplayLanguage();
        String country = locale.getDisplayCountry();
        
        System.out.println("O locale é: ");
        System.out.println(locale);
        System.out.println("O idioma do seu sistema é: ");
        System.out.println(lang);
        System.out.println("O seu país é: ");
        System.out.println(country);
    }
}
