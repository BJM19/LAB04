
package hangman.model;




public interface GameScore {
    /**
     * Indica el puntaje total dado el tipo de juego
     * @param CorrectCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return un numero con el valor del puntaje total
     */
	int CalculateScore(int CorrectCount, int incorrectCount);
    
 }

