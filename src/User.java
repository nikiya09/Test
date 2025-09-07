public class User {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Hi "+ this.name + ", you are cool");
        for(int i=0; i <=20; i++){
            System.out.println(100-i*i);
        }
    }
}
