

public class Variable {
  private String name;
  private Type type;
  private int addrOffset;

  public Variable(String _name, Type _type, int _addrOffset) {
    name = _name;
    type = _type;
    addrOffset = _addrOffset;
  }
  public String getType() {
    return type.getType();
  }

  public Type getTypeObj() {
    return this.type;
  }

  public String getName() {
    return name;
  }
  public void addItem() {}
}
