public class test {
    public static void main(String[] args) {
        bb b1 = new bb();
        b1.cc(b1);
    }
}
interface aa {

}
class bb implements aa {
    public void cc(aa a){
        System.out.println("实现了接口，也就可以是接口类的类型");
    }
}
