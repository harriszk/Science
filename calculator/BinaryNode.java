package calculator;

public abstract class BinaryNode implements Node {
    protected Node left;
    protected Node right;

    public BinaryNode(Node left, Node right)
    {
        this.left = left;
        this.right = right;
    } // end constructor

    @Override
    public int evaluate() {
        int n1 = this.left.evaluate();
        int n2 = this.right.evaluate();
        return this.evaluate(n1, n2);
    }
    
    public abstract int evaluate(int n1, int n2);
} // end BinaryNode