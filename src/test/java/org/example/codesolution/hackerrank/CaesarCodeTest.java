package org.example.codesolution.hackerrank;

import org.junit.jupiter.api.Test;

class CaesarCodeTest {

    @Test
    void testReadCaesarCode() {
        var expected = "serang di waktu fajar dengan kekuatan penuh";
        var result = CaesarCode.readMessage("xj..wfsl in. bfpyz kfo.fw ijslfs pjpzfy.fs ujszm");

        System.out.println(result);
    }

    @Test
    void testReadCaesarCode1() {
        var expected = "serang di waktu fajar dengan kekuatan penuh";
        var result = CaesarCode.readMessage(".uj...ujoh .suha. nyl..d..uxc d.....uh..auh g...ohxol");

        System.out.println(result);
    }
}