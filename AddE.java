import java.util.*;

class AddE extends FunExp {

	AddE(ExpList expList) {
		this.expList = expList;
	}

	String getFunOp() {
		return "+";
	}

	public Val Eval(HashMap<String, Val> state) {

		Val exp2Val = expList.Eval(state);
		Val exp1Val = expList.Eval(state);
		if (exp1Val == null || exp2Val == null)
			return null;

		if (exp1Val instanceof IntVal && exp2Val instanceof IntVal) {
			((IntVal) exp1Val).val = ((IntVal) exp1Val).val + ((IntVal) exp2Val).val;
			return exp1Val;
		} else if (exp1Val instanceof IntVal && exp2Val instanceof FloatVal) {
			((FloatVal) exp2Val).val = ((IntVal) exp1Val).val + ((FloatVal) exp2Val).val;
			return exp2Val;
		} else if (exp1Val instanceof FloatVal && exp2Val instanceof IntVal) {
			((FloatVal) exp1Val).val = ((FloatVal) exp1Val).val + ((IntVal) exp2Val).val;
			return exp1Val;
		} else if (exp1Val instanceof FloatVal && exp2Val instanceof FloatVal) {
			((FloatVal) exp1Val).val = ((FloatVal) exp1Val).val + ((FloatVal) exp2Val).val;
			return exp1Val;
		} else {
			System.out.println(
					"Error: + cannot be applied to ( " + exp1Val.toString() + " , " + exp2Val.toString() + " )");
			return null;
		}
	}
}