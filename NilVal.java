class NilVal extends Val {
    int i;

    NilVal(int i_) {
        i = i_;
    }

    public String toString() {
        return i + "";
    }

    Val cloneVal() {
        // TODO Auto-generated method stub
        return new NilVal(i);
    }

    float floatVal() {
        // TODO Auto-generated method stub
        return 0;
    }

    boolean isNumber() {
        // TODO Auto-generated method stub
        return false;
    }

    boolean isZero() {
        // TODO Auto-generated method stub
        return false;
    }
    // You add suitable constructors/functions.
}