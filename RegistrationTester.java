public class RegistrationTester {
    public static void main(String[] args){
        Registration signIn= new Registration();

        signIn.setEmail("booegy");
        signIn.setUserName("butt");
        signIn.setPassword("butto");
        System.out.println(signIn.getEmail());
        System.out.println(signIn.getUserName());
        System.out.println(signIn.getPassword());

    }
}
