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
import org.junit.Assert;
import org.junit.Test;

public class RomanToDecimalTest {


    @Test
    public void testRomanNumberOne() {
        int actualResult = RomanToDecimal.convertToDecimal("I");
        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void testRomanNumberOneInSmallCase() {
        int actualResult = RomanToDecimal.convertToDecimal("i");
        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void testRomanNumberFour() {
        int actualResult = RomanToDecimal.convertToDecimal("iv");
        Assert.assertEquals(4, actualResult);
    }

    @Test
    public void testRomanNumberFive() {
        int actualResult = RomanToDecimal.convertToDecimal("V");
        Assert.assertEquals(5, actualResult);
    }

    @Test
    public void testRomanNumberNine() {
        int actualResult = RomanToDecimal.convertToDecimal("iX");
        Assert.assertEquals(9, actualResult);
    }

    @Test
    public void testRomanNumberTen() {
        int actualResult = RomanToDecimal.convertToDecimal("X");
        Assert.assertEquals(10, actualResult);
    }

    @Test
    public void testRomanNumberThirty() {
        int actualResult = RomanToDecimal.convertToDecimal("XXX");
        Assert.assertEquals(30, actualResult);
    }

    @Test
    public void testRomanNumberFortyNine() {
        int actualResult = RomanToDecimal.convertToDecimal("XLIX");
        Assert.assertEquals(49, actualResult);
    }

    @Test
    public void testRomanNumberFiveHundred() {
        int actualResult = RomanToDecimal.convertToDecimal("D");
        Assert.assertEquals(500, actualResult);
    }

    @Test
    public void testRomanNumberOneThousandNineHundredNinetySix() {
        int actualResult = RomanToDecimal.convertToDecimal("MCMXCVI");
        Assert.assertEquals(1996, actualResult);
    }

    @Test
    public void testFourThousandNineHundredNinetyNine() {
        int actualResult = RomanToDecimal.convertToDecimal("MMMMCMXCIX");
        Assert.assertEquals(4999, actualResult);
    }

    @Test
    public void testTwoDigitRomanStringReturnsError() {
        int actualResult = RomanToDecimal.convertToDecimal("VV");
        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void testInValidRomanStringReturnsError() {
        int actualResult = RomanToDecimal.convertToDecimal("mmMMMM");
        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void testRandomStringReturnsError() {
        int actualResult = RomanToDecimal.convertToDecimal("abcd");
        Assert.assertEquals(0, actualResult);
    }

}
