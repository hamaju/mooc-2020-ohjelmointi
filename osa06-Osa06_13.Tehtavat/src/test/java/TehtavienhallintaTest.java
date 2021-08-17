
import static org.junit.Assert.*;
import org.junit.Test;

public class TehtavienhallintaTest {
  
    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }
    
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
    
    @Test
    public void lisattyTehtavaLoytyyListalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    
    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }
    
    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertFalse(hallinta.onTehty("Joku tehtävä"));     
    }
    
    @Test
    public void poistettuTehtava() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtävä");
        hallinta.lisaa("Toinen uusi tehtävä");
        hallinta.poista("Toinen uusi tehtävä");
        assertTrue(hallinta.tehtavalista().contains("Toinen uusi tehtävä"));
    }
}