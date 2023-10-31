package kata1;

public class BuyCar {


    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        // se definien las variables
        int months = 0;
        double moneyLeft = 0;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double savings = 0;

        // se utiliza el bucle while mientras el viejo precio y ahorro no superen al precio nuevo cada mes
        while ((priceOld + savings) < priceNew) {
            months++;

            // cada 2 meses se aplica una desvaloricacion del auto adicional de 0.5%
            if (months % 2 == 0) {
                percentLossByMonth += 0.5;
            }

            // muestra la desvalorizacion de cada auto mes a mes
            priceOld *= (1 - percentLossByMonth / 100);
            priceNew *= (1 - percentLossByMonth / 100);
            savings += savingperMonth;
        }

        moneyLeft = (savings + priceOld) - priceNew;
        return new int[]{months, (int) Math.round(moneyLeft)};


    }
}

