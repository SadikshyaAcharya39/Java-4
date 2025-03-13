import java.util.ArrayList;

public class Inst {
    private int insId;
    private String insName;
    private String address;


    Inst(int insId, String insName, String address){
        this.insId = insId;
        this.insName = insName;
        this.address = address;
    }

    public int getInsId(){
        return insId;
    }

    public String getInsName(){
        return insName;
    }

    public String getAddress(){
        return address;
    }

    public void setInsId(int insId){
        this.insId = insId;
    }

    public void setInsName(String insName){
        this.insName = insName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "ID: " + insId + "  Name: " + insName + " Address: " + address;
    }

    public static void main(String[] args) {
        Inst inst = new Inst(1, "Sadikshya", "Lalitpur");
        System.out.println(inst);

        ArrayList<Inst> instArrayList = new ArrayList();
        instArrayList.add(new Inst(2, "Sadikshya", "Lalitpur"));



//        inst.setInsId(2);
//        inst.setInsName("Amir");
//        inst.setAddress("Lalitpur");
//        System.out.println(inst.getInsId());
//        System.out.println(inst.getInsName());
//        System.out.println(inst.getAddress());
    }
}
