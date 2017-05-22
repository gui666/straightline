import java.util.Map;

public abstract class Exp extends AST {

    public abstract int eval(Map<String , Integer> mem);
}
