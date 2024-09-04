package contabancaria;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaBancariaTest {
    private ContaBancaria conta;
    
    @Before
    public void setUp() {
        conta = new ContaBancaria("12345", "123.456.789-00", 100.0);
    }
    
    @Test
    public void testDepositar() {
        conta.depositar(200.0);
        assertEquals(200.0, conta.getSaldo(), 0.0);
    }
    
    @Test
    public void testSacar() {
        conta.depositar(200.0);
        conta.sacar(150.0);
        assertEquals(50.0, conta.getSaldo(), 0.0);
    }
    
    @Test
    public void testSacarValorExcedeLimite() {
        conta.depositar(200.0);
        conta.sacar(350.0);
        assertEquals(200.0, conta.getSaldo(), 0.0);
    }
    
    @Test
    public void testDepositarSaldoNegativo() {
        conta.depositar(200.0);
        conta.sacar(250.0);
        conta.depositar(150.0);
        assertEquals(98.5, conta.getSaldo(), 0.0);
    }
    
    @Test
    public void testDepositarSaldoNegativoComTaxa() {
        conta.depositar(200.0);
        conta.sacar(250.0);
        conta.depositar(150.0);
        assertEquals(98.5, conta.getSaldo(), 0.0);
    }

    @Test
    public void testGetNumeroConta() {
        assertEquals("12345", conta.getNumeroConta());
    }

    @Test
    public void testGetCpfProprietario() {
        assertEquals("123.456.789-00", conta.getCpfProprietario());
    }
}


