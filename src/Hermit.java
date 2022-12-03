import java.util.Scanner;

public class Hermit {
    public static void Interoplacja() throws Exception {
        //wezly i wartosci wezlow
        System.out.println("Wprowadz liczbe wezlow: ");
        Scanner liczbaWezlow = new Scanner(System.in);
        int liczbaX=liczbaWezlow.nextInt();
        double wartosciWezlow []= new double [liczbaX];
        for(int i=0;i<liczbaX;i++)
        {
            System.out.println("Wprowadz wartosc x["+i+"] wezla:" );
            Scanner wartoscWezla = new Scanner (System.in);
            double wartosc= wartoscWezla.nextDouble();
            wartosciWezlow[i]=wartosc;

        }

        //krotnosci i wartosci pochodnych
        int wezly=0;
        int krotnosci[]= new int[liczbaX];
        double[][] wartosciPochodnych = new double[liczbaX][];
        for(int i=0;i<liczbaX;i++)
        {
            System.out.println("Wprowadz krotnosc wezla x["+i+"] :");
            Scanner krotnoscX = new Scanner (System.in);
            krotnosci[i]=krotnoscX.nextInt();
            wezly+=krotnosci[i];
            if(krotnosci[i]<1){throw new Exception("Krotnosc musi byc wieksza lub rowna 1, wprowadz poprawne dane i sprobuj ponownie");}
            System.out.println("Wezel"+ i + "ma "+(krotnosci[i] -1)+ "pochodne: ");
           wartosciPochodnych = new double [liczbaX][krotnosci[i]];
            for(int j=0;j<krotnosci[i];j++)
            {
                System.out.println("Wprowadz wartosc pochodnej "+j+" stopnia dla wezla x ["+i+"]: ");
                Scanner pochodna = new Scanner(System.in);
                double pochodnaX= pochodna.nextDouble();
                wartosciPochodnych[i][j]=pochodnaX;
            }
        }

        System.out.println("Wezly: "+wezly);
        //wartosci funkcji
        double[] wartosciFunkcji = new double [liczbaX];
        for(int i=0;i<wezly;i++)
        {
            for(int j=0;j<krotnosci[i];j++) {
                wartosciFunkcji[i] = wartosciPochodnych[i][j];
            }
        }
        for(int i=0;i<wezly;i++)
        {
            for(int j=0;j<krotnosci[i];j++) {
                System.out.println(wartosciFunkcji[i]);
            }
        }



        //sprawdzenie czy wezly sa w kolejnosci rosnacej i czy sa miedzy soba rozne
        for(int i=0;i<liczbaX;i++)
        {
            double najmniejszy=wartosciWezlow[i];
            if(i<liczbaX-1 && wartosciWezlow[i+1]<najmniejszy)
            {
               throw new Exception("Wezly nie sa ulozone w kolejnosci rosnacej, wprowadz wezly w poprawenj kolejnosci i sprobuj ponownie");
            }
        }
        for(int i=0;i<liczbaX;i++)
        {
            double x=wartosciWezlow[i];
            if(i<liczbaX-1&& wartosciWezlow[i+1]==x)
            {
                throw new Exception("Wezly nie sa rozne miedzy soba, wprowadz poprawne dane i sprobuj ponownie");
            }
        }
        //Wprowadzenie punktu p, w ktorym obliczamy wartosc przyblizona funkcji
        System.out.println("Wprowadz wartosc punktu p, w ktorym chcesz obliczyc przyblizona wartosc funkcji: ");
        Scanner punktInterpolacji = new Scanner(System.in);
        double p = punktInterpolacji.nextDouble();

        //Obliczanie ilorazow rozniczkowych
        double pjk[][]= new double[wezly][wezly+1];






    }
}
