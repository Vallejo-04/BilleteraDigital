package co.edu.uniquindio.billeteradigital.billeteraapp.Mapping;

import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Usuario;
import co.edu.uniquindio.billeteradigital.billeteraapp.service.IBilleteraMapping;

public class Mapper implements IBilleteraMapping {
    public Mapper() {}
    @Override
    public UsuarioDto UsuarioToUsuarioDto(Usuario usuario) {
        if (usuario == null) {
            return null;
        }else {
            return new UsuarioDto(usuario.getContrasena(),
                    usuario.getNombre(),
                    usuario.getCorreo(),
                    usuario.getNumeroCelular(),
                    usuario.getId(), usuario.getSaldoTotal(),
                    usuario.getCuentasAsociadas(),
                    usuario.getPresupuestosAsociados(),
                    usuario.getCategoriasAsociadas()
            );
        }
    }

    @Override
    public Usuario UsuarioDtoToUsuario(UsuarioDto usuarioDto) {
        if (usuarioDto == null) {
            return null;
        }else {
            return new Usuario(usuarioDto.contrasena(),
                    usuarioDto.Nombre(),
                    usuarioDto.Correo(),
                    usuarioDto.NumeroTelefono(),
                    usuarioDto.Id(),
                    usuarioDto.SaldoTotal(),
                    usuarioDto.cuentasAsociadas(),
                    usuarioDto.presupuestos(),
                    usuarioDto.Categorias())
                    ;
        }

    }


}
