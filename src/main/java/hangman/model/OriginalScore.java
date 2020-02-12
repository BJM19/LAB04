
package hangman.model;

public class OriginalScore implements GameScore{
	/**
	 * Indica el puntaje total dado el juego cuando el modo es OriginalScore
	 * @param CorrectCount numero de letras correctas
	 * @param incorrectCount numero de letras incorrectas
	 * @return numero indicando el puntaje total
	 * @pre el puntajeTotal inicial son 100 puntos
	 * @pos un puntaje no puuede ser menor a 0
	 */
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
