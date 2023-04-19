import java.util.Scanner;

public class esercizio3 {
    public class rettangolo{
        public float h;

        public float b;

        public float rettangolo(float h,float b){
            this.b=b;
            this.h=h;
        }

        public float getBase(){return  b;}

        public float getAltezza(){return h;}

        float CalcolaPerimetro()
        {
            float perimetro;
            perimetro=(b+h)*2;
            return perimetro;
        }

        float CalcolaArea()
        {
            float area;
            area=(b*h);
            return area;
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("inserisci la base del rettangolo");
        float base=sc.nextFloat();

        System.out.println("inserisci l'altezza del rettangolo ");
        float altezza=sc.nextFloat();

        rettangolo R=new rettangolo(base,altezza);
        System.out.println("il perimetro del rettangolo è: "+ R.CalcolaPerimetro());

        System.out.println("l'area del rettangolo è: "+ R.CalcolaArea());

    }

}
