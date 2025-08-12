package cl.fourtwolabs.pagos.api.pago_api;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record Producto(
    @NotBlank String nombre,
    @Min(1) int cantidad,
    @DecimalMin(value = "0.0", inclusive = true) BigDecimal precioUnitario
) {}