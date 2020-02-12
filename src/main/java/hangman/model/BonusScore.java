
package hangman.model;



public class BonusScore implements GameScore{

	/**
	 * Indica el puntajeTotal cuando el modo de juego es BonusScore
	 * @param CorrectCount numero de letras correctas
	 * @param incorrectCount numero de letras incorrectas
	 * @return numero indicando el puntajeTotal
	 * @pre el puntajeTotal inicial es 0
	 * @pos el puntajeTotal no puede ser menor a 0
	 */
 @Override 
	public int CalculateScore(int CorrectCount, int 	incorrectCount){
	int puntajeTotal=0;
	int puntosCorrectos = (CorrectCount*10);
	int puntosIncorrecto= (incorrectCount*5);
	puntajeTotal=(puntosCorrectos-puntosIncorrecto);
	if (puntajeTotal<0){
		puntajeTotal=0;
	}
	return puntajeTotal;

	}

}
