package org.example.test;
import org.example.models.Treno;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestTreno {

    @Test
    public void testEquilibrioS() {
        int[] presentes = {4, 6, 2};
        String resultado = Treno.equilibrarTreno(presentes);
        assertEquals("S", resultado);
        System.out.println("Test Equilibrio 'S' - Papai Noel, o trenó sempre esteve equilibrado.");
    }

    @Test
    public void testEquilibrioN() {
        int[] presentes = {6, 6};
        String resultado = Treno.equilibrarTreno(presentes);
        assertEquals("N", resultado);
        System.out.println("Test Equilibrio 'N' - Papai Noel, o trenó em algum momento não esteve equilibrado.");
    }

}

