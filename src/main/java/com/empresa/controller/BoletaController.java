package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entidades.Boleta;
import com.empresa.entidades.Cliente;
import com.empresa.entidades.Producto;
import com.empresa.service.BoletaService;
import com.empresa.service.ClienteService;
import com.empresa.service.ProductoService;
import com.empresa.util.AppSettings;

@RestController
@RequestMapping("/url/boleta")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class BoletaController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private BoletaService boletaService;
	
	
	
}
