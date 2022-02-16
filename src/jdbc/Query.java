package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Query {
    public static Statement stm = null;
    public static PreparedStatement preStm = null;
    public static ResultSet rs = null;
    public static java.sql.Connection conn = Connection.getConnection();
    public static String url = null;

    public static List<User> getAllUser() {

        List<User> list = new ArrayList<>();

        url = "select * from user";

        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(url);

            while (rs.next()) {
                User u = new User();
                u.setId(Integer.parseInt(rs.getString("id")));
                u.setFullName(rs.getString("full_name"));
                u.setPhone(rs.getString("phone"));

                list.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }

    public static User getUserById(int id) {
        User u = new User();

        url = "select * from user where user.id = ?";

        try {
            preStm = conn.prepareStatement(url);
            preStm.setString(1, String.valueOf(id));
            rs = preStm.executeQuery();
            while (rs.next()) {
                u.setId(Integer.parseInt(rs.getString("id")));
                u.setFullName(rs.getString("full_name"));
                u.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public static boolean addUser(User u){

        boolean bl = false;
        url = "insert into user(id,full_name,phone) values (?, ?, ?)";
        try {
            preStm = conn.prepareStatement(url);
            preStm.setString(1, String.valueOf(u.getId()));
            preStm.setString(2, u.getFullName());
            preStm.setString(3, u.getPhone());

            if(preStm.executeUpdate()!=0) {
                bl = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bl;
    }

    public static void main(String[] args) {
        System.out.println(Query.getAllUser());
        System.out.println(Query.getUserById(1));
        User u = new User(19, "Phong", "87896s");
        System.out.println(Query.addUser(u));
    }
}
