public class Proff {
    private int proff_id;
    private String proff_name;

    Proff(){
       proff_id = 0;
       proff_name = " ";
    }

    void display(){
        System.out.println(proff_id + " " + proff_name);
    }

    public static void main(String[] args) {
       Proff proff = new Proff();
       proff.display();

    }
}
