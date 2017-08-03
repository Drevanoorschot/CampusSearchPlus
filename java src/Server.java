import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;

/**
 * Created by Dre on 03-Aug-17.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/open", new PathHandler());
        server.start();
    }

    static class PathHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {

            String response = "Call successful";
            httpExchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = httpExchange.getResponseBody();
            os.write(response.getBytes());
            os.close();

            System.out.println("Incoming call...");
            String query = httpExchange.getRequestURI().getQuery();
            String path = query.split("(=)")[1];
            path = URLDecoder.decode(path, "UTF-8");
            System.out.println(path);
            Runtime.getRuntime().exec("explorer.exe \"" + path + "\"");
        }
    }
}
