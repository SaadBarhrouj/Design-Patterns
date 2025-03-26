package facade;

public class Main {
    public static void main(String[] args) {
        ServiceAchatEnLigne serviceAchatEnLigne = new ServiceAchatEnLigne();
        serviceAchatEnLigne.acheterArticle("123456789", 100.0);
    }
}