import java.util.Arrays;

public class Grundsteuer {

    public double grundsteuerBerechnen(int[][] info){
        double m = 0;
        double tax=0;

        for (int i = 0; i < info.length; i++) {
            m=info[i][1]*info[i][2];

            if (info[i][0]==1){
                tax = tax + (m * 3.20);
            }else if(info[i][0]==2){
                tax = tax + (m * 2.10);
            }else if (info[i][0]==3){
                tax = tax + ( m * 0.90);
            }
        }return tax;
    }

    public double[] grundsteuerZuordnen (int[][] property, int[] clients ){
        double m = 0;
        double[][] taxClient = new double[property.length][2];
        double[] finalTaxClient = new double[25];
        double sumTaxClient = 0;

        double[] amountTax = new double[property.length];
        for (int i = 0; i < property.length; i++) {
            m=property[i][1]*property[i][2];

            if (property[i][0]==1){
            amountTax[i] =  (m * 3.20);
        }else if(property[i][0]==2){
            amountTax[i] =  (m * 2.10);
        }else if (property[i][0]==3){
            amountTax[i] =  ( m * 0.90);}}

        for (int i = 0; i < amountTax.length; i++) {
            taxClient[i][0] = amountTax[i];
        }

        for (int i = 0; i < amountTax.length; i++) {
            taxClient[i][1] = clients[i];
        }

        for (int i = 0; i < taxClient.length; i++) {
            for (int j = 0; j < taxClient[i].length; j++) {
                System.out.println(taxClient[i][j]);

            }

        }

        double indice=0;

        for (int i = 0; i < taxClient.length; i++) {

           indice = taxClient[i][1];
            sumTaxClient=0;

           for(int j=0; j< taxClient.length;j++)
           {
               if (taxClient[j][1]==indice){


                        sumTaxClient = sumTaxClient + taxClient[j][0];
               }
           }

           finalTaxClient[(int) indice]=sumTaxClient;
        }

       return finalTaxClient;
    }
}
