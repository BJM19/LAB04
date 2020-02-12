package hangman.model;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;

public class GameScoreTest {
    @Test
    public void deberiaTenerPnutajeIgualACeroEnOriginalScore() {
        OriginalScore score = new OriginalScore();
        int puntajeTotal = score.CalculateScore(10, 20);
        Assert.assertTrue(puntajeTotal == 0);
    }

    @Test
    public void deberiaTenerPuntajeIgualACienEnOriginalScore() {
        OriginalScore score = new OriginalScore();
        int puntajeTotal = score.CalculateScore(10000, 0);
        Assert.assertTrue(puntajeTotal == 100);
    }

    @Test
    public void deberiaTenerPnutajeIgualACeroEnBonusScore() {
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(0, 15);
        Assert.assertTrue(puntajeTotal == 0);
    }

    @Test
    public void deberiaTenerPnutajeMayprADiezEnBonusScore() {
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(10, 0);
        Assert.assertTrue(puntajeTotal > 10);
    }

    @Test
    public void deberiaTenerPnutajeIgualACeroEnPowerBonusScore() {
        PowerScore tarifa = new PowerScore();
        double puntajeTotal = tarifa.CalculateScore(0, 15);
        Assert.assertTrue(puntajeTotal == 0);
    }

    @Test
    public void deberiaTenerPnutajeMayorADiezEnPowerBonusScore() {
        PowerScore tarifa = new PowerScore();
        double puntajeTotal = tarifa.CalculateScore(100, 0);
        Assert.assertTrue(puntajeTotal > 10);
    }

    @Test
    public void deberiaserSiempreMenorIgualCien() {
        OriginalScore score = new OriginalScore();
        int puntajeTotal = score.CalculateScore(0, 0);
        Assert.assertTrue(puntajeTotal <= 100);
    }

    @Test
    public void noDeberiaBonificarPorCorrecto() {
        OriginalScore score = new OriginalScore();
        int puntajeTotal = score.CalculateScore(1, 0);
        Assert.assertTrue(puntajeTotal == 100);
    }
    @Test
    public void deberiaPenalizarDiezPorIncorrecto() {
        OriginalScore score = new OriginalScore();
        int puntajeTotal = score.CalculateScore(1, 1);
        Assert.assertTrue(puntajeTotal == 90);
    }
    @Test
    public void puntajeTotalesCeroSiNoHayCorrectosNiInconrrectos() {
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(0, 0);
        Assert.assertTrue(puntajeTotal == 0);
    }
    @Test
    public void deberiaBonificarDiezPorCorrecto() {
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(1, 0);
        Assert.assertTrue(puntajeTotal == 10);
    }

    @Test
    public void sePenalizaCincoPorIncorrecto () {
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(1, 1);
        Assert.assertTrue(puntajeTotal == 5);
    }
    @Test
    public void deberiaTenerPuntajeQuinientos() {
        PowerScore tarifa = new PowerScore();
        double puntajeTotal = tarifa.CalculateScore(1000, 0);
        Assert.assertTrue(puntajeTotal ==500);
    }





}