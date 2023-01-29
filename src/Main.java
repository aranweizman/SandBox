import java.io.*;
class Employee implements java.io.Serializable{
    int x;
    public Employee(){
        x = 3;
    }
    public int getInt(){
        return x;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee x = new Employee();
        Employee y = null;
        try (OutputStream f = new FileOutputStream("e.ser");
             ObjectOutputStream os = new ObjectOutputStream(f);) {
            os.writeObject(x);
        } catch (IOException ignore) {
        }

        try (InputStream f = new FileInputStream("e.ser");
             ObjectInputStream is = new ObjectInputStream(f);) {
            y = (Employee) is.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("err");
        }

        assert y != null;
        System.out.println(y.getInt());
    }

    public static int algorithms(){
        // implementation
        return 3;
    }
}