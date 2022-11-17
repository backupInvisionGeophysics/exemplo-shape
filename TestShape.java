/*
	 TestShape.java (Java)
	 
	 Objetivo: Estudo sobre TDD com junit.
	 
	 Site: https://dirack.github.io
	 
	 Versão 1.0
	 
	 Programador: Rodolfo A C Neves (Dirack) 03/06/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 Licença: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestShape{

	@Disabled("Teste desabilitado")
	@Test
	@Tag("ColorEnum")
	@DisplayName("Obter o enum")
	public void testEnumColor(){
		assertEquals(Color.BLACK.toString(),"BLACK");
	}

	@Test
	@Tag("GetRectangleArea")
	@DisplayName("Obter a área do retângulo")
	public void testGetRectangleArea(){
		Rectangle r = new Rectangle(Color.BLUE,4.0,5.0);
		assertEquals(20.0,r.area(),0.1);
	}

	@Test
	@Tag("GetRectangleColor")
	@DisplayName("Obter a cor do retângulo")
	public void testGetRectangleColor(){
		Rectangle r = new Rectangle(Color.BLUE,4.0,5.0);
		assertEquals(r.getColor(),Color.BLUE);
	}

}
