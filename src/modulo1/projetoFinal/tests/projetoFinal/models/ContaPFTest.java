package modulo1.projetoFinal.tests.projetoFinal.models;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import modulo1.projetoFinal.exception.TransacaoInvalidaException;
import modulo1.projetoFinal.models.ContaPF;
import org.junit.jupiter.api.Test;

public class ContaPFTest {

    @Test
    void primeiroDepositoDeveSer1_000(){
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 1000);
        assertEquals(contaPF.getSaldo(), 1000);
    }
    @Test
    void nomeCompletoDeveSerEliasMoura(){
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 100000);
        assertEquals(contaPF.nomeCompleto(), "Elias Moura");
    }
    @Test
    void cpfDeveSer12345678909(){
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 100000);
        assertEquals(contaPF.getCPF(), "12345678909");
    }
    @Test
    void extradoDeveConterPrimeiroDepositoDe1_000(){
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 1000);
        assertEquals(contaPF.getExtrato().get(0).toString(), "Primeiro depósito: R$ 1.000,00");
    }

    @Test
    void toStringDeveSerEliasMouraCPF12345678909ESaldo1_000(){
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 1000);
        var msg = String.format(
                "\n- - ->ContaPF:\nNome completo: %s\nCPF: %s\nSaldo: R$ %,.2f"
                , contaPF.nomeCompleto(), contaPF.getCPF(), contaPF.getSaldo()
        );
        assertEquals(contaPF.toString(), msg);
    }

    @Test
    void saldoDeveSer1_000ApósDepositoDe1_000() throws TransacaoInvalidaException {
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 0);
        contaPF.depositar(1000);
        assertEquals(contaPF.getSaldo(), 1000);
    }

    @Test
    void saldoDeveSer0ApósSaqueDe1_000() throws TransacaoInvalidaException {
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 1000);
        contaPF.sacar(1000);
        assertEquals(contaPF.getSaldo(), 0);
    }

    @Test
    void funcaoDepositoDeveLevantarExceptionComInputNegativo() throws TransacaoInvalidaException {
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 0);
        assertThrows(TransacaoInvalidaException.class, () -> contaPF.depositar(-1000));
    }

    @Test
    void funcaoSacaDeveLevantarExceptionComInputNegativo() throws TransacaoInvalidaException {
        var contaPF = new ContaPF("Elias", "Moura", "12345678909", 0);
        assertThrows(TransacaoInvalidaException.class, () -> contaPF.sacar(-1000));
    }

}
