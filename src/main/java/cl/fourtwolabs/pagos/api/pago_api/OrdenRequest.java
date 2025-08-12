package cl.fourtwolabs.pagos.api.pago_api;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public record OrdenRequest(
    @NotBlank String cliente,

    // Ej: 2025-08-12T10:30:00
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime fecha,

    @NotEmpty List<@Valid Producto> productos
) {}