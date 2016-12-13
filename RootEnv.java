import java.util.*;

public class RootEnv extends Env {
  private HashMap<Pair<String, Vector<Type> >, Function> funcTable;
  private HashMap<Pair<String, Vector<Type> >, ForwardDec> forwardDecTable;
  private HashMap<String, Type> typedefTable;
  private boolean hasMain;

  // @override
  public RootEnv(Env _parent,int num) {
    super(_parent,num);
    parent = _parent;
    _num = num;
    hasMain = false;
    width = 0;
    isRoot = true;
    varTable = new HashMap<String, Variable>();
    funcTable = new HashMap<Pair<String,Vector<Type> >, Function> ();
    typedefTable = new HashMap<String, Type>();
    forwardDecTable = new HashMap<Pair<String,Vector<Type> >, ForwardDec>();
  }
  public boolean getMain() {
    return hasMain;
  }
  public void functionisdefined() {
    for(ForwardDec fd : forwardDecTable.values()) {
      if (!fd.isDef()) {
        System.out.println("Function " + fd.getName() + " is declared but not defined.");
      }
    }
  }

  public void setDefined(Pair<String,Vector<Type> > key) {
    if (forwardDecTable.containsKey(key)) {
      forwardDecTable.get(key).setDefined(true);
    }
  }
  public boolean funcExists(Pair<String,Vector<Type> > func) {
    if (funcTable.containsValue(func)) {
      return true;
    }
    return false;
  }

  public boolean addIfNotExistForward(Pair<String, Vector<Type> > key, Type output) {
    if (forwardDecTable.containsKey(key))
      return false;
    forwardDecTable.put(key, new ForwardDec(output, key.getFirst(), key.getSecond()));
    return true;
  }

  public boolean addIfNotExistFunc(Pair<String, Vector<Type> > hashKey, Vector<String> inputNames, Type output) {
    // System.out.println(hashKey.getFirst() + "  " + output.getType() + "  " + hashKey.hashCode() + "  " + hashKey.getFirst().hashCode() + "  " + hashKey.getSecond().hashCode());
    // Vector<Type> inputTypes = hashKey.getSecond();
    // for (int i = 0; i < inputTypes.size(); i++) {
    //   System.out.println(inputTypes.get(i).getType() + "  " + inputNames.get(i));
    // }
    //
    //
    // Set<Pair<String, Vector<Type> > > keys = funcTable.keySet();
    // for (Pair<String, Vector<Type> > pair : keys) {
    //   System.out.println("Func name: " + pair.getFirst());
    // }
    if (funcTable.containsKey(hashKey) )
      return false;

    Vector<Pair<Type, String> > inputs = new Vector<Pair<Type, String> >();
    Vector<Type> inputTypes = hashKey.getSecond();
    for (int i = 0; i < inputNames.size(); i++) {
      inputs.add(new Pair<Type,String>(inputTypes.get(i), inputNames.get(i)) );
    }
    funcTable.put(hashKey, new Function(output, hashKey.getFirst(), inputs));
    setDefined(hashKey);// if forward dec exists set its defined to true

    if (hashKey.getFirst().equals("main"))
      this.hasMain = true;
    return true;
  }

  public Type findFunction(Pair<String, Vector<Type> > inputs, int line)  {
      if (!funcTable.containsKey(inputs)) {
        for (Pair<String, Vector<Type> > key : funcTable.keySet()) {
          if (key.getFirst().equals(inputs.getFirst())) { //there is a function with this name2
            if (key.getSecond().size() < inputs.getSecond().size()) {// less arguments
              int d = inputs.getSecond().size() - key.getSecond().size() + 1;
              System.out.println("line "+ line + " Function call " +  inputs.getFirst() + " missing " +  d + " arguments");
              return new InvalidType();
            }
            else if (key.getSecond().size() > inputs.getSecond().size()) { //more arguments
              int d = key.getSecond().size() - inputs.getSecond().size() + 1;
              System.out.println("line" + line + " Function call " + inputs.getFirst() + " having " +  d + " arguments extra");
              return new InvalidType();
            }
            else { // arguments dont match
              System.out.println("line " + line + " Function call" + inputs.getFirst() + " arguments do not match the function itself");
              return new InvalidType();
            }
          } //there isnt even a function
          else {
            System.out.println("line " + line + " " + inputs.getFirst() + " function is not defined");
            return new InvalidType();
          }
        }
      }
      return funcTable.get(inputs).getRetType();
    }
    public Function findByName(String name) {
      for (Pair<String, Vector<Type> > key : funcTable.keySet()) {
        if (key.getFirst().equals(name)) {
          return funcTable.get(key);
        }
      }
      return null;
    }
    public void prinf() {
        for (Pair<String, Vector<Type>> name: funcTable.keySet()){
                Function value = funcTable.get(name);
                System.out.println(name + " " + value.getTypes().toString());


    }
      }
}
