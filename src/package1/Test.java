/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author User
 */
class User {

    int id;
    String name;
    String mobile;

    private User(User.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.mobile = builder.mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String toString() {
        return "id=" + id
                + ", name='" + name + '\''
                + ", mobile='" + mobile + '\'';
    }

    static class Builder {

        private int id;
        private String name;
        private String mobile;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public User builder() {
            return new User(this);
        }
    }

}

public class Test {

    public static void main(String[] args) {

        User.Builder builder = new User.Builder().setId(1).setMobile("0711234567").setName("rukshan");
        User user = builder.builder();
        System.out.println(user);
        
    }
}
