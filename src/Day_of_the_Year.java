/* INSTRUCCIONES "DAY OF THE YEAR"
Work out what number day of the year it is.

        toDayOfYear([1, 1, 2000]) => 1
        The argument passed into the function is an array with the format [D, M, YYYY], e.g. [1, 2, 2000] for February 1st, 2000 or [22, 12, 1999] for December 22nd, 1999.

        Don't forget to check for whether it's a leap year! Three criteria must be taken into account to identify leap years:

        The year can be evenly divided by 4;
        If the year can be evenly divided by 100, it is NOT a leap year, unless;
        The year is also evenly divisible by 400. Then it is a leap year.

 */

public class DateToInt{

    public static int toDayOfYear(int[] date){

        int day = date[0];
        int month = date[1];
        int year = date[2];

        // DIAS DE AÑO NO BISIESTO
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // CONTROLAR SI EL AÑO ES BISIESTO, FEBRERO CON 29 DIAS
        if (esBisiesto(year)) {
            daysInMonth[2] = 29;
        }

        //SEGUIMIENTO DE LOS DIAS POR MES PARA EL TOTAL DEL AÑO
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }

        dayOfYear += day;

        return dayOfYear;
    }


    // VERIFICAR SI ES DIVISIBLE POR 4 ES BISIESTO
    public static boolean esBisiesto(int year) {
        if (year % 4 == 0) {


            // SI DIVIDE POR 100 NO ES BISIESTO ||  SI DIVIDE POR 400 ES BISIESTO
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] date = {1, 1, 2000};
        int dayOfYear = toDayOfYear(date);
        System.out.println("El número del día del año es: " + dayOfYear);
    }
}