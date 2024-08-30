package ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class test1 {
	@Before
	public void setUp() throws Exception {
		Empresa redDragon = new Empresa("redDragon", "123456789");
		EmpleadoPermanente pepe = new EmpleadoPermanente(1, 2, false, 100);
		EmpleadoPermanente marc = new EmpleadoPermanente(0, 1, true, 50);
		EmpleadoTemporario kizu = new EmpleadoTemporario(1, 1, 10);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
