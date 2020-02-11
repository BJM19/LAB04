
package hangman.model;

public class OriginalScore implements GameScore{

 @Override 
	public int CalculateScore(int CorrectCount, int 	incorrectCount){
		int puntajeTotal=100;
		int puntosIncorrecto =(incorrectCount*10);
		puntajeTotal-=puntosIncorrecto;
		if (puntajeTotal<0){
			puntajeTotal=0;
		}
	return puntajeTotal;

	}

}
