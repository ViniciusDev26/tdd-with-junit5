package manager.services;

import manager.models.Employer;
import manager.models.Performance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SalaryReadjustmentServiceTest {
    private Employer employer;
    private SalaryReadjustmentService sut;

    @BeforeEach()
    public void initializeProperties() {
        employer = new Employer("vinicius", LocalDate.now(), new BigDecimal("1000"));
        sut = new SalaryReadjustmentService();
    }

    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsLow() {
        sut.execute(employer, Performance.LOW);

        Assertions.assertEquals(new BigDecimal("1030.00"), employer.getSalary());
    }

    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsMedium() {
        sut.execute(employer, Performance.MEDIUM);

        Assertions.assertEquals(new BigDecimal("1150.00"), employer.getSalary());
    }

    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsHigh() {
        sut.execute(employer, Performance.HIGH);

        Assertions.assertEquals(new BigDecimal("1200.00"), employer.getSalary());
    }
}
