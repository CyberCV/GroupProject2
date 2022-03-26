public class Registration {
    /*
    Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also
valid password cannot contain userName
     */



    private String userName;
    private String email;
    private String password;

    public String getPassword() {
        return "password: "+password;
    }
    public void setPassword(String password) {
        this.password = password;
        if (password.equalsIgnoreCase(userName) || password.length() > 7
                || password.isEmpty()) {

            System.out.println("Password the same as user name" +
                    " or not 6 characters or less");
        }
    }

    public String getEmail() {
        return "email: "+email+"@yahoo.com";
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public String getUserName() {
        return "username: "+userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.length()>7||userName.isEmpty()){
            System.out.println("Please enter 6 characters or less for username");
        }
    }







    }


