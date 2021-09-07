/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplointerpeter;

/**
 *
 * @author Johan
 */
public class OperationExpression implements Expression

{



        private String operation;



        public OperationExpression(String token)

        {

                this.operation = token;

        }

        @Override
        public void interpret(Context context)
        {
                context.setOperation(this.operation);

        }

}

