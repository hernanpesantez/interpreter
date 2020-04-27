class NilVal extends Val {
    int i;

    NilVal(int i_) {
        i = i_;
    }

    public String toString() {
        return i + "";
    }

    Val cloneVal() {
        return new NilVal(i);
    }

    float floatVal() {
        return (float)(i);
    }

    boolean isNumber() {
        return false;
    }

    boolean isZero() {
        return false;
    }
}