package com.yiwang.javalearningbasic.day10;

class AException extends Exception{}
class BException extends AException{}
class CException extends Exception{}

class Fu{
    void show() throws AException{

    }
}
class Zi extends Fu{
    void show() throws BException{

    }
}
public class ExceptionDemo6 {

}
