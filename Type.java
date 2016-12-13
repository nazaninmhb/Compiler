import java.util.Vector;

public class Type implements Comparable<Type> {
    private int size;
    protected String name;
    public Type(String _name) {
      name = _name;
    }
    public void setSize() {}
    public String getType() {return name;}
    public int hashCode() {
      return name.hashCode();
    }

    public boolean equals(Object b) {
      if (this instanceof ListType) {
        if(b instanceof ListType && (((ListType)b).getLength() == ((ListType)this).getLength())) {
          for (int i = 0; i < ((ListType)this).getLength(); i++) {
            if (!(((ListType)b).getListType(i).equals(((ListType)this).getListType(i))))
              return false;
          }
          return true;
        }
        return false;
      }
      if (this instanceof Ptf) {
        if (b instanceof Ptf) {
          if ( !(((Ptf)this).matchesInputType(((Ptf)b).getInputTypes())) || !(((Ptf)this).matchesOutputType(((Ptf)b).getOtput()))) {
            return false;
          }
          return true;
        }
        return false;
      }

      if(b instanceof Type)
        return name == ((Type)b).name;
      return false;
    }

    public int compareTo(Type b) {
      return name.compareTo(b.name);
    }

    public boolean isVoid() {
      return (name.equals("void"));
    }
}
