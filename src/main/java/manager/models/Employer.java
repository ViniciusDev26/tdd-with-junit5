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

    public String getName() {
        return name;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
