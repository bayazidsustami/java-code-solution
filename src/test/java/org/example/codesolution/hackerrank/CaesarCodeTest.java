package org.example.codesolution.hackerrank;

import org.example.codesolution.hackerrank.caesarcode.CaesarCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarCodeTest {

    @Test
    void testReadCaesarCode() {
        var expected = "serang di waktu fajar dengan kekuatan penuh";
        var result = CaesarCode.readMessage("xj..wfsl in. bfpyz kfo.fw ijslfs pjpzfy.fs ujszm");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testReadCaesarCode1() {
        var expected = "apapun yang terjadi jangan mundur";
        var result = CaesarCode.readMessage(".uj...ujoh .suha. nyl..d..uxc d.....uh..auh g...ohxol");

        Assertions.assertEquals(expected, result);
    }
}