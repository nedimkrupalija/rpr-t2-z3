package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.lang.Math;

public class Main {


    public static double standardDeviation(List<Integer> l)
    {
        double sum = 0.0;
        double mean = 0.0;
        double num=0.0;
        double numi = 0.0;
        double deno = 0.0;

        for (int i : l) {
            sum+=i;
        }
        mean = sum/l.size();

        for (int i : l) {
            numi = Math.pow((double) i - mean, 2);
            num+=numi;
        }

        return Math.sqrt(num/l.size());
    }

    public static double average(List<Integer> l)
    {
        Integer suma =0;
        if(!l.isEmpty())
        {
            for(Integer broj : l)
            {
                suma = suma + broj;
            }
            return suma.doubleValue()/l.size();
        }
        return suma;
    }

    public static void main(String[] args) {




        List<Integer> lista = new ArrayList<Integer>();
        String n;
        while(true){
            System.out.println("Unesite broj");
            Scanner ulaz = new Scanner(System.in);
            n = ulaz.next();

            if(n instanceof String)
            {
                if(n.equals("stop")) break;
                try{
                    Integer.parseInt(n);

                }
                catch (NumberFormatException e) {
                    System.out.println("Niste unijeli broj, ponovite unos!");
                    continue;
            }

                System.out.println(Integer.parseInt(n));
            }
            int broj =  Integer.parseInt(n);
            lista.add(broj);
            System.out.println("Max: " + Collections.max(lista));
            System.out.println("Min: " + Collections.min(lista));
            System.out.println("Srednja vrijednost: " + average(lista));
            System.out.println("Devijacija: "  + standardDeviation(lista));
        }
    }
}