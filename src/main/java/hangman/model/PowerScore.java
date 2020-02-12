
package hangman.model;




public class PowerScore implements GameScore {
	/**
	 * indica el puntajeTotal cuando el modo de juego es powerScore
	 * @param CorrectCount numero de letras correctas
	 * @param incorrectCount numero de letras incorrectas
	 * @return numero indicando el puntajeTotal
	 * @pre el puntajeTotal inicia en 0
	 * @pos el puntajeTotal no puede ser mayor a 500
	 */
 @Override 
	public int CalculateScore(int CorrectCount, int 	incorrectCount){
		int puntajeTotal=0;
		int  puntosCorrectos=0;
		for (int i = 1;i<=CorrectCount;i++) {
			 puntosCorrectos += Math.pow(5,i);
		}
		int  puntosIncorrecto = (incorrectCount*8);
		puntajeTotal=( puntosCorrectos-puntosIncorrecto);
		if (puntajeTotal<0){
			puntajeTotal=0;
		}
		if (puntajeTotal>=500){
			puntajeTotal=500;
		}
	return puntajeTotal;

	}

}
