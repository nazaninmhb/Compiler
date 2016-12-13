import java.util.*;

public class Env {
  protected HashMap<String, Variable> varTable;
  protected Integer width;
  protected boolean isRoot;
  protected Env parent;
  protected int _num;

  public Env(Env _parent,int num) {
    parent = _parent;
    width = 0;
    isRoot = false;
    varTable = new HashMap<String, Variable>();
    _num = num;
  }

  public Variable getVar(String name) {
    return varTable.get(name);
  }
  public int Num() {
    return _num;
  }
  // public void addIfNotExistVars(Vector<Variable> v) {
  //     for (int i = 0; i < v.size(); i++) {
  //       if (!varTable.containsKey(v.get(i).getName())) {
  //         varTable.put(v.get(i).getName(),v.get(i));
  //       }
  //     }
  //     System.out.println("Added");
  // }
  public void addIfNotExistVar(Vector<Variable> keys) {
    for (int i = 0; i < keys.size(); i++) {
      if (varTable.containsKey(keys.get(i).getName()))
        System.out.println("variable " + keys.get(i).getName() + " is allready defined");
      varTable.put(keys.get(i).getName(),keys.get(i));
    }
  }

  public boolean varExists(String name) {
    if (varTable.containsKey(name)){
        return true;
    }
    return false;
  }
  public void printVar() {
    for (String name: varTable.keySet()){
            Variable value = varTable.get(name);
            System.out.println(name + " " + value.getType() );


}
  }

  public Type listHasLabel(String varname, String labelVar) {
    Variable var = varTable.get(varname);
    if (var != null && var.getType().equals("list")) {
      ListType lst = (ListType)var.getTypeObj();
      for (int i = 0; i < lst.getLength(); i++) {
        if (lst.getListLabel(i) != null && lst.getListLabel(i).equals(labelVar)) {
          return lst.getListType(i);
        }
      }
    }
    return null;
  }

  public Type listHasIndex(String name, int i) {
    Variable var = varTable.get(name);
    if (var != null && var.getType().equals("list")) {
      ListType lst = (ListType)var.getTypeObj();
      if (i <= lst.getLength())
          return lst.getListType(i);
      }
      return null;
  }

}
