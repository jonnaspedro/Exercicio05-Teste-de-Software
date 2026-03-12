package br.edu.ifpe.jaboatao.ts.servicos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.edu.ifpe.jaboatao.ts.entidades.Cliente;
import br.edu.ifpe.jaboatao.ts.entidades.Locacao;
import br.edu.ifpe.jaboatao.ts.entidades.Roupa;
import br.edu.ifpe.jaboatao.ts.exceptions.RoupaException;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class LocacaoServiceTest {

	LocacaoService service;
	
	@DisplayName("Método de Repetição")
	@beforeEach
	public void antesdometodo() {
		service = new LocacaoService();
	}
	
	@DisplayName("Método de Repetição")
	@Test
	public void teste01() {
		// Cenário
		LocacaoService service = new LocacaoService();
		Cliente cliente = new Cliente("João");
		Roupa roupa = new Roupa("Algodão", "P", 76, 7.5);

		// Ação
		try {
			Locacao locacao = service.alugarRoupa(cliente, roupa);
		} catch (RoupaException e) {

		// Verificação
			assertEquals("Preco Inferior a 10", e.getMessage());
			System.out.println("test01 deu certo");
		}
	}

	@Disabled
	@DisplayName("Método de Repetição")
	@Test
	public void teste02() {
		// Cenário
		LocacaoService service = new LocacaoService();
		Cliente cliente = new Cliente("João");
		Roupa roupa = new Roupa("Algodão", "P", 76, 7.5);

		// Ação
		RoupaException e = assertThrows(RoupaException.class, () -> {
			Locacao locacao = service.alugarRoupa(cliente, roupa);	
		}, "Sistema 02 deu erro");

		// Verificação
		assertEquals("Preco Inferior a 10", e.getMessage());
		System.out.println("test02 deu certo");
		
	}
	

}
