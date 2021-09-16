package dev.lucaspolo.lox;

import java.util.List;
import java.util.Map;

public class LoxClass implements LoxCallable{
    final String name;
    final LoxClass superclass;
    private final Map<String, LoxFunction> methods;

    LoxClass(String name, LoxClass superclass, Map<String, LoxFunction> methods) {
        this.superclass = superclass;
        this.name = name;
        this.methods = methods;
    }

    LoxFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        if (superclass != null) {
            return superclass.findMethod(name);
        }

        return null;
    }

    @Override
    public String toString() {
        return "LoxClass{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int arity() {
        var initializer = findMethod("init");
        if (initializer == null) return 0;
        return initializer.arity();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        LoxInstance instance = new LoxInstance(this);
        var initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }
}
