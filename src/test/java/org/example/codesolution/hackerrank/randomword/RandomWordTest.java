package org.example.codesolution.hackerrank.randomword;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RandomWordTest {

    @Test
    void testRandomWord() {

        List<String> input = List.of(
                "UGHCVTBQZSALWQO",
                "DAQSSXWQHCKWOVM",
                "VAHIOCMLAQMZION",
                "LMVRAQWROTHFMBT",
                "XSVQKRFBKDFGCBE",
                "MBJDLRQETKGOHLQ",
                "VLBRGWSGLBLDAQW",
                "QOELDPLIKDNVKVD",
                "VHSKFORLOGLLBJD",
                "HFIEKODLHPDMWEK",
                "LFWNAJEDPOAYTDD",
                "KDGPESNFYFLMAKE",
                "FKFOGEWRKGLHADK",
                "FMXDPWLQPFJGLJG",
                "GLDPRLWQLMNVJFK",
                "TKPLSGLDOSMGOHM"
        );

        List<String> word = List.of(
                "ADA",
                "TOKO",
                "SIAPA"
        );

        var result = RandomWord.find(input, word);

        System.out.println(result);
    }

    @Test
    void testRandomWord1() {

        List<String> input = List.of(
                "UGHCVTBQZSALWQO",
                "DAQSSXWQHCKWOVM",
                "VAHIOCMLAQMZION",
                "LMVRAQWROTHFMBT",
                "XSVQKRFBKDFGCBE",
                "MBJDLRQETKGOHLQ",
                "VLBRGWSGLBLDAQW",
                "QOELDPLIKDNVKVD",
                "VHSKFORLOGLLBJD",
                "HFIEKODLHPDMWEK",
                "LFWNAJEDPOAYTDD",
                "KDGPESNFYFLMAKE",
                "FKFOGEWRKGLHADK",
                "FMXDPWLQPFJGLJG",
                "GLDPRLWQLMNVJFK",
                "TKPLSGLDOSMGOHM"
        );

        List<String> word = List.of(
                "ADA",
                "TOKO",
                "SIAPA"
        );

        var result = RandomWord.find(input, word);

        System.out.println(result);
    }
}