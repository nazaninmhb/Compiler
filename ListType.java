import java.util.Vector;


public class ListType extends Type {
  private int length;
  private Vector<Type> members;
  private Vector<String> memberIDs;
  public ListType(Vector<Type> _members, Vector<String> _memids, String _name) {
    super(_name);
    members = new Vector<Type>(_members);
    memberIDs = new Vector<String>(_memids);
    length = _members.size();
  }
  public ListType(int _length, Vector<Type> _members, String _name) {
    super(_name);
    members = new Vector<Type> (_members);
    length = _length;
    memberIDs = new Vector<String> (_members.size());
    for (int i = 0; i < memberIDs.size(); i++) {
      memberIDs.set(i, null);
    }
  }
  public String getType() {return "list";}
  public Type getListType(int i) {return members.get(i);}
  public String getListLabel(int i) {return memberIDs.get(i);}
  public int getLength() {return length;}

  public Type getLabelType(String _label) {
    for (int i = 0; i < length; i++) {
      if (getListLabel(i) != null && getListLabel(i).equals(_label))
        return getListType(i);
    }
    return null;
  }

  public Type getIndexType(int i) {
    if (i < length)
      return getListType(i);
    return null;
  }

  public Type oneType() {
    boolean isOne = true;
    Type t = members.get(0);
    for (int i = 1; i < length; i++) {
      if (!t.equals(members.get(i)))
        return null;
    }
    return t;
  }
}
