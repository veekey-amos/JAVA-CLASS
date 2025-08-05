public abstract class User implements Authenticable {

    private String email;

    private String password;

    @Override
    public boolean authenticate(){
        return false;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    abstract String getpermission();

    @Override
    public String otp(){
        return null;
    }
    @Override
    public String passkey(){
        return null;
    }
}