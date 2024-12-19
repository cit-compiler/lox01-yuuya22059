package com.craftinginterpreters.lox;

import java.til.List;

abstract class Expr{
    Binary(Expr left, Token operator, Expr right){
    this.x = x;
    this.o = o;
    this.x = x;
    }

    final Expr left;
    final Token operator;
    final Expr right;
    }
    Grouping(Expr expression){
    this.x = x;
    }

    final Expr expression;
    }
    Literal(Object value){
    this.b = b;
    }

    final Object value;
    }
    Unary(Token operator, Expr right){
    this.o = o;
    this.x = x;
    }

    final Token operator;
    final Expr right;
    }
}
