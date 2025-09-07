public class Main {
    public static void main(String[] argv){
        System.out.println("hello world");
        for (int i=0; i<10; i++){
            System.out.println(i*i);
        }
        String a = "I love Nikiya";
        for (char c: a.toCharArray()){
            if (c != ' '){
                System.out.print(c);
            } else {
                System.out.println();
            }
        }
        System.out.println();
        User user = new User();
        user.setName("nikiya");
        user.printName();
    }
}
