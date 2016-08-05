package org.namstorm.deltaforce.samples;

import junit.framework.TestCase;

/**
 * Created by maxnam-storm on 5/8/2016.
 */
public class ComplexPersonTest extends TestCase {
    public static final byte VAL_BYTE = 'A';
    public static final double VAL_DOUBLE = 1.1f;
    public static final float VAL_FLOAT = 2.1f;
    public static final int VAL_INT = 2;
    public static final short VAL_SHORT = 3;
    public static final long VAL_LONG = 10_000;
    public static final int[] VAL_INT_ARR = new int[]{VAL_INT, VAL_INT + 1, VAL_INT + 2};


    public void testSetters() throws Exception {
        ComplexPerson testPerson = new org.namstorm.deltaforce.samples.ComplexPersonBuilder(new ComplexPerson())
                .setByteValue(VAL_BYTE)
                .setDoubleValue(VAL_DOUBLE)
                .setFloatValue(VAL_FLOAT)
                .setIntValue(VAL_INT)
                .setIntValues(VAL_INT_ARR)
                .setShortValue(VAL_SHORT)
                .setLongValue(VAL_LONG)
                .build();

        assertEquals(VAL_BYTE, testPerson.getByteValue());
        assertEquals(VAL_DOUBLE, testPerson.getDoubleValue());
        assertEquals(VAL_FLOAT, testPerson.getFloatValue());
        assertEquals(VAL_INT, testPerson.getIntValue());
        assertEquals(VAL_SHORT, testPerson.getShortValue());
        assertEquals(VAL_INT_ARR, testPerson.getIntValues());
    }
}