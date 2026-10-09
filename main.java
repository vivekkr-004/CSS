public class main {
    public static void main(String[] args) {
        // created a pen obj called p1
        Pen p1 = new pen();
        p1.color = "red"k;
        System.out.println(p1.color);
        p1.setColor("black");
        System.out.println(p1.color);


        creating an obj for bankacc
        BankAccount = myAcc = new BankAccount ();
        myAcc.Username = "vivek";
        // myAcc.Password = 123; // error

        myAcc.setPassword(1234); // accessed


    }
}


// create class

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    public String Username; 
    private int Password; 

    public void setPassword(int pwd) {
        password = pwd;
    }
}