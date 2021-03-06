package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Point;

public class PointTest {
    private Point pt;
    int xyz = 4;

    @Before
    public void before() {
        pt = new Point(2, 3, 1);
    }

    @Test
    public void testPoint() {
        pt = new Point(xyz, xyz, xyz);
        assertEquals(xyz, pt.getX());
        assertEquals(xyz, pt.getY());
        assertEquals(xyz, pt.getZ());
    }
    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
        assertEquals(1, pt.getZ());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
        assertEquals(0, pt.getZ());
    }

    @Test
    public void testModulo() {
        assertEquals(3.7416, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
        assertEquals(0, pt.getZ());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3,1]", pt.toString());
    }

}
