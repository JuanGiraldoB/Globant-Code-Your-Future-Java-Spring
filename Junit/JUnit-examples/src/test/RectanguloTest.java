package test;

import main.Entities.Rectangulo;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    Rectangulo rec;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @After
    public void tearDown() {
    }

    @Before
    public void setUp() {
        rec = new Rectangulo(10,10);
    }

    @Test
    public void deberiaInicializarConColor() {
        Rectangulo rec = new Rectangulo(10, 10);
        assertNotNull(rec.getColor());
    }

    @Test
    public void deberiaCalcularArea() {
        assertEquals(100, rec.getArea(), 0);
        assertEquals(70, rec.getArea(), 30);
        assertEquals(80, rec.getArea(), 20);
    }
}