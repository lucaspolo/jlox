package dev.lucaspolo.lox.globals;

import dev.lucaspolo.lox.*;

import java.util.List;

public class Exit implements LoxCallable {
    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        System.exit(0);
        return null;
     }
}
