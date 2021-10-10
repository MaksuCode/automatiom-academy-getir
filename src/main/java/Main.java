public class Main {

    public static void main(String[] args) {
        //kişiBilgileri("Mustafa" , 52 , "Erkek", 189, 89, true);
        int a = 10;
        int b = 5 ;
        boolean karşılaştır = a > b;
        System.out.println(karşılaştır);

    }

    public static void kişiBilgileri(String ad, int yaş, String cinsiyet, int boy, int kilo , boolean evliMi){
        System.out.println("Ad : " + ad);
        System.out.println("yaş : " + yaş);
        System.out.println("cinsiyet :" + cinsiyet);
        System.out.println("boy : " + boy);
        System.out.println("kilo :" + kilo);
        if (evliMi){
            System.out.println("Evli");
        }else{
            System.out.println("Bekar");
        }

    }







}
