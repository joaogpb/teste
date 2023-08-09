import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculadora {
    public int Somar(int g1, int g2){
        return g1 + g2;
    }

    public int Subtrair(int g1, int g2){
        return g1 - g2;
    }

    public int Multiplicar(int g1, int g2){
        return g1 * g2;
    }

    public double Dividir(int g1, int g2){
        return g1 / g2;
    }

    public double Potencia(int g1, int g2){
        return g1 ^ g2;
    }
    public double Potencia(int g1){
        return g1 ^ (1/2);
    }
    @Test
    public void TesteResultadoCalculadora() {

        //Sucesso Esperado
        Assertions.assertEquals(Somar(10, 2), 12);
        Assertions.assertEquals(Subtrair(12, 4), 8);
        Assertions.assertEquals(Multiplicar(9, 3), 27);
        Assertions.assertEquals(Dividir(80, 2), 40);
        Assertions.assertEquals(Potencia(12, 2), 144);
        Assertions.assertEquals(Potencia(25, 1/2), 5);

    }

}
