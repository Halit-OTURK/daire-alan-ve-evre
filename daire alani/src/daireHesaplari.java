import java.util.Scanner;
public class daireHesaplari {
    public static void main(String[] args) {
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Alan Formülü : π * r * r;
        //
        //Çevre Formülü : 2 * π * r;

        double r,alan,cevre,π =3.14;

        Scanner yaricap= new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz:");
        r=yaricap.nextDouble();

        alan=π*r*r;
        cevre=π*2*r;
        System.out.println("DAİRENİN ÇEVRESİ:"+cevre);
        System.out.println("DAİRENİN ALANI:"+alan);



    }

}
