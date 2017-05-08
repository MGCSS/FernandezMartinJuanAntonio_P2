
package practica2;

import modelo.Experto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ManejaExpertoTest {
    
    public ManejaExpertoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inicioOperacion method, of class ManejaExperto.
     */
    @Test
    public void testInicioOperacion() {
        System.out.println("inicioOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.inicioOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardaExperto method, of class ManejaExperto.
     */
    @Test
    public void testGuardaExperto() {
        System.out.println("guardaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.guardaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaExperto method, of class ManejaExperto.
     */
    @Test
    public void testEliminaExperto() {
        System.out.println("eliminaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.eliminaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizaExperto method, of class ManejaExperto.
     */
    @Test
    public void testActualizaExperto() {
        System.out.println("actualizaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.actualizaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenExperto method, of class ManejaExperto.
     */
    @Test
    public void testObtenExperto() {
        System.out.println("obtenExperto");
        String idExperto = "";
        ManejaExperto instance = new ManejaExperto();
        Experto expResult = null;
        Experto result = instance.obtenExperto(idExperto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenNombreYEspecialidad method, of class ManejaExperto.
     */
    @Test
    public void testObtenNombreYEspecialidad() {
        System.out.println("obtenNombreYEspecialidad");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenNombreYEspecialidad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaConParametro method, of class ManejaExperto.
     */
    @Test
    public void testListaConParametro() {
        System.out.println("listaConParametro");
        String keyword = "";
        ManejaExperto instance = new ManejaExperto();
        instance.listaConParametro(keyword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenCasos method, of class ManejaExperto.
     */
    @Test
    public void testObtenCasos() {
        System.out.println("obtenCasos");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenCasos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizaOperacion method, of class ManejaExperto.
     */
    @Test
    public void testFinalizaOperacion() {
        System.out.println("finalizaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.finalizaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
