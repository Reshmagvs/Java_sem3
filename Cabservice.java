import java.util.Scanner;

class Cabservice {
    String taxiNo, name; 
    int d, amt;

    Cabservice() {
        taxiNo = ""; 
        name = "";
        d = 0;
        amt = 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter taxi number: ");
        taxiNo = in.nextLine(); 
        System.out.println("Enter name of the passenger: ");
        name = in.nextLine();
        System.out.println("Enter distance travelled: ");
        d = in.nextInt(); 
    }

    void calculate() {
        if (d <= 1) {
            amt = 25;
        } else if (d > 1 && d <= 5) {
            amt = d * 30;
        } else if (d > 5 && d <= 10) {
            amt = d * 35;
        } else if (d > 10 && d <= 20) {
            amt = d * 40;
        } else if (d > 20) {
            amt = d * 45;
        }
    }

    void display() {
        System.out.println("Taxi No\tName\t\tDistance(km)\tBill Amount(Rs.)");
        System.out.println(taxiNo + "\t" + name + "\t" + d + "\t\t" + amt); 
    }

    public static void main(String[] args) {
        Cabservice ob = new Cabservice();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
