package cl.fourtwolabs.pagos.api.pago_api;

import java.time.LocalDateTime;

public record OrdenResponse(
    String estado,
    int totalProductos,
    String cliente,
    LocalDateTime fecha
) {}
