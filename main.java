public class main {
    public static void main(String[] args) {
        // created a pen obj called p1
        Pen p1 = new pen();
        p1.color = "red"k;
        System.out.println(p1.color);
        p1.setColor("black");
        System.out.println(p1.color);

        

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