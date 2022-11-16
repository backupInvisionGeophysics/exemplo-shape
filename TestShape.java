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
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestShape{

	@Test
	@Tag("GetRectangleArea")
	@DisplayName("Obter a área do retângulo")
	public void testGetRectangleArea(){
		Rectangle r = new Rectangle();
		assertEquals(20.0,r.area(),0.1);
	}

}
