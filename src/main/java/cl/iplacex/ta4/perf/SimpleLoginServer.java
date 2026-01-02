package cl.iplacex.ta4.perf;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public class SimpleLoginServer {
  public static void main(String[] args) throws Exception {
    int port = 8080;

    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

    server.createContext("/health", exchange -> {
      byte[] body = "OK".getBytes(StandardCharsets.UTF_8);
      exchange.sendResponseHeaders(200, body.length);
      try (OutputStream os = exchange.getResponseBody()) { os.write(body); }
    });

    server.createContext("/login", exchange -> {
      URI uri = exchange.getRequestURI();
      String q = uri.getQuery() == null ? "" : uri.getQuery();

      boolean ok = q.contains("user=admin") && q.contains("pass=1234");
      String msg = ok ? "LOGIN_OK" : "LOGIN_FAIL";
      int status = ok ? 200 : 401;

      byte[] body = msg.getBytes(StandardCharsets.UTF_8);
      exchange.sendResponseHeaders(status, body.length);
      try (OutputStream os = exchange.getResponseBody()) { os.write(body); }
    });

    server.start();
    System.out.println("Server running on http://localhost:" + port);
  }
}
