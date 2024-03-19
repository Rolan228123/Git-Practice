package pages;



public class Login {

    static String username;
    static String password;

    public static void main(String[] args) {

        username = System.getenv("username");
        password = System.getenv("password");


        System.out.println(username);
        System.out.println(password);


    }

}
