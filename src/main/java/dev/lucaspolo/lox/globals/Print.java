package dev.lucaspolo.lox.globals;

import dev.lucaspolo.lox.Interpreter;
import dev.lucaspolo.lox.LoxCallable;

import java.util.List;

public class Print implements LoxCallable {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        System.out.println(arguments.get(0));
        return null;
    }
}
