import java.util.*;

public class ForwardDec {
  private String name;
  private Vector<Type> inputs;
  private Type output;
  private boolean isDefined;

  public ForwardDec(Type _output, String _name, Vector<Type> types) {
    inputs = new Vector<Type>(types);
    output = _output;
    name = _name;
  }
  public boolean isDef() {
    return isDefined;
  }
  public String getName() {
    return name;
  }
  public void setDefined(boolean state) {
    isDefined = state;
  }
}
