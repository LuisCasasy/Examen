/**********************
Luis Enrique Casas Yañez
Exam.java
Eliminar los espacios de una frase pasada por consola
por el usuario.
***********************/
public class Exam
{
    public static void TrimMejorado (String cadena)
    {
        int i,longitud,aux=0;
        longitud=cadena.length();
        String x=" ";
        System.out.print("La cadena sin espacios en blanco quedaria asi: ");
        for (i=0 ; i<=longitud ; i++)
        {
            if(x.charAt(0)!=cadena.charAt(i))
            {
                System.out.print(cadena.charAt(i));
            }
        }

    }
}
