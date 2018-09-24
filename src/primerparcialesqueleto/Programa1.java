/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primerparcialesqueleto;

/**
 *
 * @author agomezdg
 */
public class Programa1 {
    public static void main(String s[]) {
        /* Sí debería ser reconocido como palíndromo: */
	String frase="Anita lava la tina";
        analiza(frase);

        /* No debería ser reconocido como palíndromo: */
	frase="123";
        analiza(frase);

        /* Sí debería ser reconocido como palíndromo: */
        frase="aba";
        analiza(frase);

        /* Sí debería ser reconocido como palíndromo: */
        frase="abba";
        analiza(frase);

        /* No debería ser reconocido como palíndromo: */
        frase="Anatawa buta mitaini taberu";
        analiza(frase);

        /* No debería ser reconocido como palíndromo: */
        frase="xxmnzz";
        analiza(frase);

        /* Sí debería ser reconocido como palíndromo: */
        frase="a    aa";
        analiza(frase);
    }

    /* Dada una frase, pregunta a otro método si la frase es o no es un
     * palíndromo y despliega el mensaje correspondiente: */
    private static void analiza(String frase) {
	if(esPalindromo(frase))
            System.out.println(frase+" es un palíndromo.");
	else
            System.out.println(frase+" no es un palíndromo.");
    }

    // Aquí se debe insertar el método esPalindromo.
    
    private static boolean esPalindromo(String frase) {
        boolean palindrome = true;
        frase = frase.replace(" ", "");
        ArrayStack<String> stack1 = new ArrayStack();
        ArrayStack<String> stack2 = new ArrayStack();
        for (int i = 0; i < frase.length(); i++) {
            stack1.push("" + frase.charAt(i));
        }
        for (int i = frase.length()-1; i >= 0; i--) {
            stack2.push("" + frase.charAt(i));
        }
        
        while(!stack1.isEmpty() && palindrome) {
            palindrome = stack1.pop().equalsIgnoreCase(stack2.pop());
        }
       
        return palindrome;
    }
}
