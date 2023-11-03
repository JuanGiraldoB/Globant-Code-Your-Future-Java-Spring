import services.AuthorService;

public class Library {
    public static void main(String[] args) {
        AuthorService as = new AuthorService();

        try{
            as.createAuthor("Rocket", true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
