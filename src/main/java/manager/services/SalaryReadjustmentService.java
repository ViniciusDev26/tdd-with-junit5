package manager.services;

import manager.models.Employer;
import manager.models.Performance;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class SalaryReadjustmentService {
    public void execute(@NotNull Employer employer, @NotNull Performance performance) {
        BigDecimal newSalary = employer
                .getSalary()
                .add(
                        employer.getSalary().multiply(
                                performance.percentageReadjustment()
                        )
                );
        employer.setSalary(newSalary);
    }
}
