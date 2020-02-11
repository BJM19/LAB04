
package hangman.model;

import hangman.model.dictionary.HangmanDictionary;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class BonusScore implements GameScore{

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
