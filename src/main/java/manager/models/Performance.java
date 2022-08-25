package manager.models;

import java.math.BigDecimal;

public enum Performance {
    LOW {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.03");
        }
    },
    MEDIUM {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.15");
        }
    },
    HIGH {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percentageReadjustment();
}
