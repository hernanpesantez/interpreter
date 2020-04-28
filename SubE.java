import java.util.HashMap;

class SubE extends FunExp {
    Exp exp;

    SubE(ExpList expList) {

        this.expList = expList;
    }

    SubE(Exp exp, ExpList expList) {

    }

    String getFunOp() {
        return "-";
    }

    public Val Eval(HashMap<String, Val> state) {
        Val exp1Val = exp.Eval(state);
        Val exp2Val = expList.Eval(state);
        if (exp1Val == null || exp2Val == null)
            return null;

        if (exp1Val instanceof IntVal && exp2Val instanceof IntVal) {
            ((IntVal) exp1Val).val = ((IntVal) exp1Val).val - ((IntVal) exp2Val).val;
            return exp1Val;
        } else if (exp1Val instanceof IntVal) {
            ((FloatVal) exp2Val).val = ((IntVal) exp1Val).val - ((FloatVal) exp2Val).val;
            return exp2Val;
        } else {
            ((FloatVal) exp1Val).val = exp1Val.floatVal() - exp2Val.floatVal();
            return exp1Val;
        }
    }
}