import java.util.*;

public class ScopeHandler {
  public Stack<Env> scopes;

  public ScopeHandler() {
    scopes = new Stack<Env>();
  }

  public void push(Env _new) {
    scopes.push(_new);
  }

  public Env pop() {
    return scopes.pop();
  }
  public Env top() {
    return scopes.peek();
  }
}
