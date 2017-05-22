import javaslang.render.ToTree;

public abstract class AST implements ToTree<String> {
    abstract int maxargs();

}
