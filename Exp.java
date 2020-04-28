import java.util.*;

abstract class Exp {
    void printParseTree(String indent) {
        IO.displayln(indent + indent.length() + " <exp>");
    }

    String id;
    FunExp funExp;

    // int i = Integer.parseInt(State.Int.toString());

    IntVal intVal = new IntVal(23);

    public Val Eval(HashMap<String, Val> state) {

        Val eVal = funExp.Eval(state);
        if (eVal != null)
            state.put(id, eVal);

        return intVal.cloneVal();
    }

}