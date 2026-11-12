import java.math.BigDecimal;

public class CalcModel {
    private BigDecimal total = BigDecimal.ONE;

    // BigDecimal evita perder precision con decimales largos.
    public void multiplyBy(String numero) {
        total = total.multiply(new BigDecimal(numero.trim()));
    }

    public void addBy(String numero) {
        total = total.add(new BigDecimal(numero.trim()));
    }

    public void subtractBy(String numero) {
        total = total.subtract(new BigDecimal(numero.trim()));
    }

    public String getValue() {
        return total.stripTrailingZeros().toPlainString();
    }

    public void reset() {
        total = BigDecimal.ONE;
    }
}
