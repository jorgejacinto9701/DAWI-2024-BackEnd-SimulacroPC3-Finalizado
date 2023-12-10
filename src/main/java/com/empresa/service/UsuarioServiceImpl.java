package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entidades.Pasatiempo;
import com.empresa.entidades.Usuario;
import com.empresa.entidades.UsuarioHasPasatiempo;
import com.empresa.entidades.UsuarioHasPasatiempoPK;
import com.empresa.repository.UsuarioHasPasatiempoRepository;
import com.empresa.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioHasPasatiempoRepository usuarioHasPasatiempoRepository;
	
	@Override
	public List<Usuario> listaUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public List<Pasatiempo> traerPasatiempoDeUsuario(int idUsuario) {
		return usuarioRepository.traerPasatiempoDeUsuario(idUsuario);
	}


	@Override
	public UsuarioHasPasatiempo insertaPasatiempo(UsuarioHasPasatiempo obj) {
		return usuarioHasPasatiempoRepository.save(obj);
	}

	@Override
	public void eliminaPasatiempo(UsuarioHasPasatiempo obj) {
		usuarioHasPasatiempoRepository.delete(obj);
	}

	@Override
	public Optional<UsuarioHasPasatiempo> buscaPasatiempo(UsuarioHasPasatiempoPK obj) {
		return usuarioHasPasatiempoRepository.findById(obj);
	}
}
