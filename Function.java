import java.util.*;

public class Function {
  public String name;
  private Vector<Pair<Type, String> > inputs;
  private Type output;

  public Function(Type _output, String _name, Vector<Pair<Type, String> > _inputs) {
    inputs = new Vector<Pair<Type, String> >(_inputs);
    output = _output;
    name = _name;
  }
  public Vector<Type> getTypes() {
    Vector<Type> hi = new Vector<Type>();
    for (int i =0; i < inputs.size(); i++) {
      hi.add(inputs.get(i).getFirst());
    }
    return hi;
  }

  public Type getRetType() {
    return this.output;
  }
}
