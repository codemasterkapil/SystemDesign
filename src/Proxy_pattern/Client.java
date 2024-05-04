package Proxy_pattern;

public class Client {
    public static void main(String[] args) {
        Image image=new ProxyImage("example.png");
        image.display();

    }
}
