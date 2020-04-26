import java.util.*;

abstract class Exp {
    void printParseTree(String indent) {
        IO.displayln(indent + indent.length() + " <exp>");
    }

    // int i = Integer.parseInt(State.Int.toString());

    IntVal intVal = new IntVal(23);

    public Val Eval(HashMap<String, Val> hashMap) {

        System.out.println(State.Int);

        return intVal.cloneVal();
    }

}