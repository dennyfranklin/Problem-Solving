
 class SampleProgram {
    int a = 10;
    int b = 20;
    public int addNumbers(){
        return a+b;
    }
    public static void main(String[] args){
        SampleProgram sam = new SampleProgram();
        System.out.println(sam.addNumbers());
    }
}
