package ru.netology.sqrr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqrr.services.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "5,300,500",
            "61,100,5000"
    })
    public void shouldCalculateExpect(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }

}