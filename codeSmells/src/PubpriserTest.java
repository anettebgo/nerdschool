import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class PubpriserTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Pub pub;

    @Before
    public void setUp() throws Exception {
        pub = new Pub();
    }

    @Test
    public void enOlTest() {
        int pris = pub.beregnPris(pub.EN_OL, false, 1);
        assertEquals(74, pris);
    }

    @Test
    public void testStudenterFarRabattPaOl() throws Exception {
        int pris = pub.beregnPris(pub.EN_OL, true, 1);
        assertEquals(67, pris);
    }

    @Test
    public void testCiderErSvindyrt() throws Exception {
        int pris = pub.beregnPris(pub.EN_CIDER, false, 1);
        assertEquals(103, pris);
    }

    @Test
    public void testOrdentligCiderErEndaDyrere() throws Exception {
        int pris = pub.beregnPris(pub.EN_ORDENDTLIG_CIDER, false, 1);
        assertEquals(110, pris);
    }

    @Test
    public void testGTPRis() throws Exception {
        int faktisk_pris = pub.beregnPris(pub.GT, false, 1);
        assertEquals(115, faktisk_pris);
    }

    @Test
    public void testDrinkIkkeISortimentGirFeil() throws Exception {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Finnes ikke");
        pub.beregnPris("sanfranciscosling", false, 1);
    }

    @Test
    public void testDrinkGirIkkeRabattForStudenter() throws Exception {
        int faktisk_pris = pub.beregnPris(pub.GT, true, 1);
        assertEquals(115, faktisk_pris);
    }

    @Test
    public void testBacardiSpecial() throws Exception {
        int faktisk_pris = pub.beregnPris(pub.BACARDI_SPECIAL, false, 1);
        assertEquals(127, faktisk_pris);
    }

    @Test
    public void testKanBareKjopeToDrinkerISlengen() throws Exception {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("For mange");
        pub.beregnPris(pub.BACARDI_SPECIAL, false, 3);
    }

    @Test
    public void testToOlForStudentGirRabattPaBegge() throws Exception {
        int faktisk_pris = pub.beregnPris(pub.EN_OL, true, 2);
        assertEquals(67*2, faktisk_pris);
    }

    @Test
    public void testKanBestilleMerEnnToOl() throws Exception {
        pub.beregnPris(pub.EN_OL, false, 5);
    }
}
