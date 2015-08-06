/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is a very simple grammar to show the process of compiler construction with crsx 
 *
 * @author : m schett
 * @date   : 06/27/2015
 */
 
grammar Simpl;
 
// a program is exactly one assignment of a variable followed by one expression
// example: "x:=1 1+x+1+x"
simpl      
    : assign exp
    ;   
    
assign
    : VAR (ASS number) 
    ;
        
exp  
    : number PLUS exp 
    | VAR PLUS exp
    | VAR
    | number
    ;
    
number 
    : ONE
    | ZERO
    ;

ASS  : ':=';
PLUS : '+';
VAR  : [a-z];
ONE  : '1';
ZERO : '0';