import java.io.DataInputStream;

public class HW4 {
    public static void main(String[] args) throws Exception {
        DataInputStream data = new DataInputStream(System.in);
        System.out.print("Enter Event Name: ");
        String eventName = data.readLine();
        System.out.print("Enter Event Date: ");
        String eventDate = data.readLine();
        System.out.print("Enter Event Location: ");
        String eventLocation = data.readLine();

        System.out.println(">>> Your Event <<<");
        System.out.println("Name = "+eventName);
        System.out.println("Date = "+eventDate);
        System.out.println("Location = "+eventLocation);
    }
}
 