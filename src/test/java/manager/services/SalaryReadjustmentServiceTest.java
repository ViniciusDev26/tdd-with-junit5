package manager.services;

import manager.models.Employer;
import manager.models.Performance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SalaryReadjustmentServiceTest {
    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsLow() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal("1000"));
        SalaryReadjustmentService sut = new SalaryReadjustmentService();

        sut.execute(employer, Performance.LOW);

        Assertions.assertEquals(new BigDecimal("1030.00"), employer.getSalary());
    }

    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsMedium() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal("1000"));
        SalaryReadjustmentService sut = new SalaryReadjustmentService();

        sut.execute(employer, Performance.MEDIUM);

        Assertions.assertEquals(new BigDecimal("1150.00"), employer.getSalary());
    }

    @Test()
    public void shouldReturnCorrectReadjustmentWhenPerformanceIsHigh() {
        Employer employer = new Employer("vinicius", LocalDate.now(), new BigDecimal("1000"));
        SalaryReadjustmentService sut = new SalaryReadjustmentService();

        sut.execute(employer, Performance.HIGH);

        Assertions.assertEquals(new BigDecimal("1200.00"), employer.getSalary());
    }
}
