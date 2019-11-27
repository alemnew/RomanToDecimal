/*
 * Copyright 2019 Alemnew Asrese
 * <p>
 * A test program for roman number to decimal integer converter.
 *
 * @author alemnew.asrese@aalto.fi Alemnew Asrese
 * Created on 2019/11/27
 */

package fi.documill.roman.test;

import fi.documill.roman.main.RomanToDecimal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToDecimalTest {

    private RomanToDecimal romanToDecimal;

    @Before
    public void setup() {
        romanToDecimal = new RomanToDecimal();
    }

    @Test
    public void testRomanNumberOne() {
        int actualResult = romanToDecimal.convertToDecimal("I");
        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void testRomanNumberOneInSmallCase() {
        int actualResult = romanToDecimal.convertToDecimal("i");
        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void testRomanNumberFour() {
        int actualResult = romanToDecimal.convertToDecimal("iv");
        Assert.assertEquals(4, actualResult);
    }

    @Test
    public void testRomanNumberFive() {
        int actualResult = romanToDecimal.convertToDecimal("V");
        Assert.assertEquals(5, actualResult);
    }

    @Test
    public void testRomanNumberNine() {
        int actualResult = romanToDecimal.convertToDecimal("iX");
        Assert.assertEquals(9, actualResult);
    }

    @Test
    public void testRomanNumberTen() {
        int actualResult = romanToDecimal.convertToDecimal("X");
        Assert.assertEquals(10, actualResult);
    }

    @Test
    public void testRomanNumberThirty() {
        int actualResult = romanToDecimal.convertToDecimal("XXX");
        Assert.assertEquals(30, actualResult);
    }

    @Test
    public void testRomanNumberFortyNine() {
        int actualResult = romanToDecimal.convertToDecimal("XLIX");
        Assert.assertEquals(49, actualResult);
    }

    @Test
    public void testRomanNumberFiveHundred() {
        int actualResult = romanToDecimal.convertToDecimal("D");
        Assert.assertEquals(500, actualResult);
    }

    @Test
    public void testRomanNumberOneThousandNineHundredNinetySix() {
        int actualResult = romanToDecimal.convertToDecimal("MCMXCVI");
        Assert.assertEquals(1996, actualResult);
    }

    @Test
    public void testFourThousandNineHundredNinetyNine() {
        int actualResult = romanToDecimal.convertToDecimal("MMMMCMXCIX");
        Assert.assertEquals(4999, actualResult);
    }

    @Test
    public void testTwoDigitRomanStringReturnsError() {
        int actualResult = romanToDecimal.convertToDecimal("VV");
        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void testInValidRomanStringReturnsError() {
        int actualResult = romanToDecimal.convertToDecimal("mmMMMM");
        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void testRandomStringReturnsError() {
        int actualResult = romanToDecimal.convertToDecimal("abcd");
        Assert.assertEquals(0, actualResult);
    }

    @After
    public void clean() {
        romanToDecimal = null;
    }
}
