package co.edu.uniquindio.billeteradigital.billeteraapp.service;

import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Usuario;

public interface IBilleteraMapping {
    public UsuarioDto UsuarioToUsuarioDto(Usuario usuario);
    public Usuario UsuarioDtoToUsuario(UsuarioDto usuarioDto);
}
