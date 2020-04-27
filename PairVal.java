class PairVal extends Val {
    Val first;
    Val second;

    PairVal(Val first, Val second){
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return "pair(" + first + ", " + second + ")";
    }

    Val cloneVal() {
        return null;
    }

   
    float floatVal() {
        return 0;
    }

   
    boolean isNumber() {
        return false;
    }

    
    boolean isZero() {
        return false;
    }

}