package cl.fourtwolabs.pagos.api.pago_api;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdenController {

    @PostMapping("/procesar-orden")
    public ResponseEntity<OrdenResponse> procesar(@Valid @RequestBody OrdenRequest req) {
        // total de productos = suma de cantidades
        int total = req.productos().stream().mapToInt(Producto::cantidad).sum();

        // Requerido: imprimir en consola Cliente, Fecha, Total de productos
        System.out.printf("Cliente: %s | Fecha: %s | Total productos: %d%n",
                req.cliente(), req.fecha(), total);

        var resp = new OrdenResponse("OK", total, req.cliente(), req.fecha());
        return ResponseEntity.ok(resp);
    }
}