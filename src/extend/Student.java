package extend;

public class Student extends Person implements Action {
    @Override
    public void study() {
        System.out.println("Go to School");
    }
}

class Demo {
    public static void main(String[] args){
        Student st = new Student();
        st.setName("Hung");
        st.setSex("Nam");
        st.setAge(23);
        st.showInfo();
        st.study();
    }
}
