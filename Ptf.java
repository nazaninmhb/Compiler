import java.util.*;

public class Ptf extends Type {
  Vector<Type> inputTypes;
  Type output;
  public Ptf(Vector<Type> _inputTypes, Type _output) {
    super("ptf");
    inputTypes = _inputTypes;
    output = _output;
  }

  public Type getOutputType() {
    return output;
  }

  public boolean matchesInputType(Vector<Type> _types) {
    if (_types.size() != inputTypes.size())
      return false;
    for (int i = 0; i < _types.size(); i++) {
      if (!_types.get(i).equals(inputTypes.get(i)))
        return false;
    }
    return true;
  }
  public boolean matchesOutputType(Type _output) {
    if (!(_output.getType().equals(this.output.getType())))
      return false;
    return true;
  }
  public Type getOtput() {
    return this.output;
  }
  public Vector<Type> getInputTypes() {
    return this.inputTypes;
  }
}
