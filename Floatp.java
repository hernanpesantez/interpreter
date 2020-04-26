class Floatp extends Exp {
    float floatElem;

    Floatp(float f) {
        floatElem = f;
    }

    void printParseTree(String indent) {
        super.printParseTree(indent);
        String indent1 = indent + " ";
        IO.displayln(indent1 + indent1.length() + " " + floatElem);
    }

    public Val eval(String a, int index) {

        a.length();
        if (Character.isLetter(a.charAt(index))) {// insert conditions that do not
            System.out.println("Error " + a + " is not a Float.");
            return null;
        } else {
            return eval(a, index++);
        }

    }
}