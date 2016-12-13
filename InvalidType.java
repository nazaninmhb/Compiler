public class InvalidType extends Type {
  public InvalidType() {
    super("invalid");
  }

  public String getType() {
    return this.name;
  }
}
