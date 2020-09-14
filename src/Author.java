public class Author {
    private String email;
    private String name;
    private char gender;

    public Author(String e, String n, char g) {
        email = e;
        name = n;
        gender = g;
    }

    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender(char gender) {
        return gender;
    }

    public String toString() {
        return this.name + "'s' email is " + this.email + "gender is " + this.gender;
    }
}
