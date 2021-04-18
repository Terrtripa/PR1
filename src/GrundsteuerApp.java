import java.util.Arrays;

public class GrundsteuerApp {
    public static void main(String[] args) {
        int[][] property1 = {
                {1,20,10},
                {2,13,20},
                {3,40,50},{1,20,10}}
                ;

        Grundsteuer Tax = new Grundsteuer();
        int[] client = {0,4,0, 4};

        System.out.println("grundsteuer = " + Tax.grundsteuerBerechnen(property1));
        System.out.println("Tax.grundsteuerZuordnen() = " + Arrays.toString(Tax.grundsteuerZuordnen(property1, client)));


    }
}
