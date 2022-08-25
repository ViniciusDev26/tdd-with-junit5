package manager.services;

import manager.models.Employer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {
    @Test()
    public void shouldReturnZeroIfBonusIsBiggerThenOneThousand() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal(10001));
        BonusService sut = new BonusService();

        BigDecimal bonus = sut.calculateBonus(employer);

        Assertions.assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test()
    public void shouldReturnCorrectlyBonus() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal(2500));
        BonusService sut = new BonusService();

        BigDecimal bonus = sut.calculateBonus(employer);

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test()
    public void shouldReturnCorrectlyBonusIfEmployerReceiveCeilBonusRange() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal(10000));
        BonusService sut = new BonusService();

        BigDecimal bonus = sut.calculateBonus(employer);

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
