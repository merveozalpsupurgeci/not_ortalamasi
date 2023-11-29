import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz = ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz = ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz = ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz = ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz = ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz = ");
        muzik = input.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;

        System.out.println("Ortamanız = " + sonuc);

        int kosul = 60;



        boolean gecme = sonuc >= kosul;
        String str = gecme ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.println (str);


        }
    }
