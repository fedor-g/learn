public class Client {

  public static void main(String[] args) {
    DigestAuthenticationHandler handler = new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(new BasicAuthenticationHandler(null)));

    handler.handleRequest("digest");
    handler.handleRequest("cert");
    handler.handleRequest("basic");
  }

}
