package hangman.model;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;

public class GameScoreTest {
    @Test
    public void deberiaTenerPnutajeIgualACeroEnOriginalScore() {
        OriginalScore score=new OriginalScore();
        int puntajeTotal = score.CalculateScore(10,20);
        Assert.assertTrue(puntajeTotal==0);
    }
    @Test
    public void deberiaTenerPuntajeIgualACienEnOriginalScore(){
        OriginalScore score=new OriginalScore();
        int puntajeTotal = score.CalculateScore(10000,0);
        Assert.assertTrue(puntajeTotal==100);
    }

    @Test
    public void deberiaTenerPnutajeIgualACeroEnBonusScore(){
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(0,15);
        Assert.assertTrue(puntajeTotal==0);
    }
    @Test
    public void deberiaTenerPnutajeMayprADiezEnBonusScore(){
        BonusScore tarifa = new BonusScore();
        double puntajeTotal = tarifa.CalculateScore(10,0);
        Assert.assertTrue(puntajeTotal>10);
    }
    @Test
    public void deberiaTenerPnutajeIgualACeroEnPowerBonusScore(){
        PowerScore tarifa = new PowerScore();
        double puntajeTotal = tarifa.CalculateScore(0,15);
        Assert.assertTrue(puntajeTotal==0);
    }
    @Test
    public void deberiaTenerPnutajeMayorADiezEnPowerBonusScore(){
        PowerScore tarifa = new PowerScore();
        double puntajeTotal = tarifa.CalculateScore(100,0);
        Assert.assertTrue(puntajeTotal>10);
    }
}