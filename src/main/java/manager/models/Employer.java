package manager.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employer {
    private String name;
    private LocalDate admissionDate;
    private BigDecimal salary;

    public Employer(String name, LocalDate admissionDate, BigDecimal salary) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void readjustSalary(BigDecimal readjust) {
        this.salary = this.salary.add(readjust);
    }
}
