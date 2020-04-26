class PairVal extends Val {
    Val first;
    Val second;

    public String toString() {
        return "pair(" + first + ", " + second + ")";
    }

    @Override
    Val cloneVal() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    float floatVal() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    boolean isNumber() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    boolean isZero() {
        // TODO Auto-generated method stub
        return false;
    }

    // You add suitable constructors/functions.
}