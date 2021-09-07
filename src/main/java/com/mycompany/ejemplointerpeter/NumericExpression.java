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
public class NumericExpression implements Expression

{

        private String value;



        public NumericExpression(String token)

        {

                this.value = token;

        }

        @Override
        public void interpret(Context context)

        {

                context.setOperator(context.getInteger(this.value));

                context.calculate();

        }

}