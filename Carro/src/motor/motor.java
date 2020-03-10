package motor;

/*
 * Author: Tiago Onofre
 * class: motor
 */

public class motor
{
    // Variavél para indicar se o motor está ligado.
    // false = Desligado.
    // true = ligado.
    public boolean mtLigado = false;

    // O inteiro representará a quantidade de trocas de oleo após a saída da fábrica.
    public int oleoMotor = 0;


    // Metódo requisitado na atividade.
    public void trocaOleo()
    {
        oleoMotor += 1;
    }
    
}
    
    