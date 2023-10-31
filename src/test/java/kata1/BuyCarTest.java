package kata1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuyCarTest {

    @Test
    // Se prueba el valor real del ejercicio codewar
    public void test1() {
        int[] r = new int[]{6, 766};
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }


    @Test
    // Se prueba con valor del auto viejo a 12.000
    public void test2() {
        int[] r = new int[] { 0, 4000 };
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
    }

    @Test
    // Se prueba obtener restante de 500$ para el valor de auto viejo en $1695
    public void test3() {
        int[] expected = new int[]{6, 500};
        int[] result = BuyCar.nbMonths(1695, 8000, 1000, 1.5);
        assertArrayEquals(expected, result);
    }
}