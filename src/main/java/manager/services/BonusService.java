package manager.services;

import manager.models.Employer;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calculateBonus(@NotNull Employer employer){
        BigDecimal value = employer.getSalary().multiply(new BigDecimal("0.1"));
        if(value.compareTo(new BigDecimal("1000")) > 0) {
            value = BigDecimal.ZERO;
        }

        return value.setScale(2, RoundingMode.HALF_UP);
    }
}
