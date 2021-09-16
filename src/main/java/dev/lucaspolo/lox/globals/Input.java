package dev.lucaspolo.lox.globals;

import dev.lucaspolo.lox.Interpreter;
import dev.lucaspolo.lox.LoxCallable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Input implements LoxCallable {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        System.out.print(arguments.get(0));

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
