class Meta {

    private int userId;
    private String email;
    private String name;
    private int age;

    public Meta(int userId, String name, int age, String email) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {

        Meta facebook = new Meta(916, "Shariful Islam", 21, "shariful21@gmail.com");


        System.out.println("User Details:");
        System.out.println("ID: " + facebook.getUserId());
        System.out.println("Name: " + facebook.getName());
        System.out.println("Age: " + facebook.getAge());
        System.out.println("Email: " + facebook.getEmail());
    }
}