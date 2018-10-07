/**
 * Runner for Problem Set 1.
 * Instructions at https://github.com/kellylougheed/java-pset1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Identical id = new Identical();
        StickyText st = new StickyText();
        PasswordChecker pass = new PasswordChecker();
        Caesar caesar = new Caesar();
        Hamlet hamlet = new Hamlet();
        Hangman hangman = new Hangman();
     
        String[] arg = {};
        
        System.out.println("Problem 1-0: Calculator");
        calc.main(arg);
        
        System.out.println("Problem 1-1: Identical");
        id.main(arg);
        
        System.out.println("Problem 1-2: Sticky Text");
        st.main(arg);
        
        System.out.println("Problem 1-3: Password Checker");
        pass.main(arg);
        
        System.out.println("Problem 1-4: Caesar Cipher");
        caesar.main(arg);
        
        System.out.println("Problem 1-5: Hamlet");
        hamlet.main(arg);
        
        System.out.println("Problem 1-6: Hangman");
        hangman.main(arg);

    }
}
