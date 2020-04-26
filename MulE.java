import java.util.HashMap;

class MulE extends FunExp {
    MulE(ExpList e) {
        expList = e;
    }

    String getFunOp() {
        return "*";
    }

    // public Val Eval(HashMap<String, Val> state) {
    // Val exp1Val = exp.Eval(state);
    // Val exp2Val = funExp.Eval(state);
    // if (exp1Val == null || exp2Val == null)
    // return null;

    // // The result will be float if one or both of the arguments are float.

    // Class exp1Class = exp1Val.getClass();
    // Class exp2Class = exp2Val.getClass();

    // if (exp1Class == IntVal.class && exp2Class == IntVal.class) {
    // ((IntVal) exp1Val).val = ((IntVal) exp1Val).val * ((IntVal) exp2Val).val;
    // return exp1Val;
    // } else if (exp1Class == IntVal.class) // termClass == FloatVal.class
    // {
    // ((FloatVal) exp2Val).val = ((IntVal) exp1Val).val * ((FloatVal) exp2Val).val;
    // return exp2Val;
    // }

    // else // primaryClass == FloatVal.class
    // {
    // ((FloatVal) exp1Val).val = exp1Val.floatVal() * exp2Val.floatVal();
    // return exp1Val;
    // }
    // }
}