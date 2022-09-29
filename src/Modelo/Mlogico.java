package Modelo;

/**
 *
 * @author sijodido
 */
public class Mlogico {
    
    /**
     * verifica si dos numeros enteros son iguales 
     * @param num1
     * @param num2
     * @return 
     */
    
    public boolean sonIguales(int num1, int num2){
        return num1 == num2;
    }
    
    /**
     * verifica si dos numeros reales son iguales
     * @param num1
     * @param num2
     * @return 
     */
    
    public boolean sonIguales(double num1, double num2) {
        return num1 == num2;
    }
    
    public double numeroMayor (double num1, double num2) {
        
        if (num1 > num2) {
            return num1;
        } 
        return num2;
    }
    
    public double numeroMenor (double num1, double num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
    
    public boolean numMayorIgual(double num1, double num2) {
        return num1 >= num2;
    }
    
    public boolean numMenorIgual(double num1, double num2) {
        return num1 <= num2;
    }
    
    public boolean charIguales (String char1, String char2) {
        return char1.equals(char2);
    }
    
    public boolean charDesiguales (String char1, String char2) {
        return char1.equals(char2);
    }
}