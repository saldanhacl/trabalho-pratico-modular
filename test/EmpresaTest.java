import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    public void somarTest(){
        Empresa e = new Empresa();
        int soma = e.somar(1,2);
        assertEquals(3,soma);
    }

}