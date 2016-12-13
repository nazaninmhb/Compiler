
public class PointerType extends Type {
  private Type pointedTo;

  // @Override
  public PointerType (Type _pointedTo, String _name) {
    super(_name);
    pointedTo = _pointedTo;
  }
  public String getType() {return "pointer type";}
}
