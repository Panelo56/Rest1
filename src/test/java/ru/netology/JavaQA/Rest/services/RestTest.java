package ru.netology.JavaQA.Rest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.javaqamvn.services.BonusService;

public class RestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void TestParameter(int expected, int income, int expenses, int threshold) {
        Rest service = new Rest();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    //@Test
    //public void Test() {
    //Rest service = new Rest();
    //int expected = 2;
    //int income = 100_000; // доход от работы
    //int expenses = 60_000; // обязательные месячные траты
    //int threshold = 150_000; // есть возможность отдохнуть
    //int actual = service.calculate(income, expenses, threshold);

    //Assertions.assertEquals(expected, actual);
    //}
}
