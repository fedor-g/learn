public abstract class AuthenticationHandler {

  private AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler handler) {
    this.next = handler;
  }
  public void handleRequest(String requestType) {
    if (next != null) {
      next.handleRequest(requestType);
    }
  }

}
