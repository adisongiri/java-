interface In1 {
    int a = 20;

    void dispaly();

}
class Testclass implements In1{
    public  void dispaly(){
        System.out.println("Adison age is");
    }
    public static void main(String[] args) {
        Testclass testclass=new Testclass();
        testclass.dispaly();
        System.out.println(a);
    }
}