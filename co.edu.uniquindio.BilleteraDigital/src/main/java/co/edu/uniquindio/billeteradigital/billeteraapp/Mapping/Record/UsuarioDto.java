package co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record;

import co.edu.uniquindio.billeteradigital.billeteraapp.model.Categoria;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Cuenta;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Presupuesto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public record UsuarioDto(String contrasena,
                         String Nombre,
                         String Correo,
                         String NumeroTelefono,
                         String Id,
                         double SaldoTotal,
                         ArrayList<Cuenta> cuentasAsociadas,
                         ArrayList<Presupuesto> presupuestos,
                         ArrayList<Categoria> Categorias
                         ) {
}
