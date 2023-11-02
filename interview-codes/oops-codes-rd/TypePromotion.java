public class TypePromotion {
    /*
    Compile time Polymorphism 
     * Number of Arguments Diff
     * Type of Arguments Diff
     * Order of Arguments Diff
     * No Matter for return type and no matter for access modifer
     */
    // public int show(int x){
    //     System.out.println("1 Args int");
    //     return x;

    // }
    protected void show(Long x){
        System.out.println("Long");
    }
    // protected void show(int... x){
    //     System.out.println("var args int");
    // }
    // protected void show(Integer x){
    //     System.out.println("Integer");
    // }
    // protected void show(double x){
    //     System.out.println("double");
    // }
    // protected void show(long x){
    //     System.out.println("long");
    // }
    protected void show(){
        System.out.println("0 Args ");
    }
    protected void show(int a, int b){
        System.out.println("2 Args int");
    }

    public static void main(String[] args) {
        TypePromotion t = new TypePromotion();
       // t.show();
       // t.show(10);
       // t.show("Hello");
    }
}
