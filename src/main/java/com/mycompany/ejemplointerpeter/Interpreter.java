/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplointerpeter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class Interpreter{

        public static void main(String [] args)

        {
                Scanner leer = new Scanner(System.in);
                // Creamos el arbol de expresiones y el contexto

                ArrayList<Expression> tree = new ArrayList();

                Context context = new Context();
            System.out.println("Escriba la operacion que desea realizar: ");
                String texto = leer.nextLine();
                String palabras[] = texto.split(" ");
                
                

                // Añadimos los tokens pasados como argumentos

                for(String token : palabras)

                {

                        if(context.getInteger(token) >= 0)

                                tree.add(new NumericExpression(token));

                        else

                                tree.add(new OperationExpression(token));

                }



                // Interpretamos cada expresión

                for(Expression e : tree){

                        e.interpret(context);

                }

                // Mostramos el resultado

                System.out.println("El resultado de la interpretación es " + context.getResult());

        }

}