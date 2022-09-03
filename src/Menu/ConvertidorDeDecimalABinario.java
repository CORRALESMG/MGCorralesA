/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author GCAM
 */
public class  ConvertidorDeDecimalABinario {

    /**
     * @param decimal
     * @return 
     */
    public static String ConvertirDeDecimalaBinario(long decimal) {
	if (decimal <= 0) {
		return "0";
	}
	StringBuilder binario = new StringBuilder();
	while (decimal > 0) {
		short residuo = (short) (decimal % 2);
		decimal = decimal / 2;
		binario.insert(0, String.valueOf(residuo));
	}
	return binario.toString();
}
    
    }
