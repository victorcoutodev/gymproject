package com.academia.tech.gymproject;

import com.academia.tech.gymproject.enums.TipoUsuario;
import com.academia.tech.gymproject.models.UsuarioModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GymprojectApplicationTests {

	@Test
	void contextLoads() {

		UsuarioModel usuarioModel = new UsuarioModel();

		usuarioModel.setNome("Daniel");
		usuarioModel.setTipoUsuario(TipoUsuario.ALUNO);
		System.out.println(usuarioModel);
		System.out.println(usuarioModel.getNome());


	}

}
