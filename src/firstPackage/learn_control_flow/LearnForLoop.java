package firstPackage.learn_control_flow;

public class LearnForLoop {

    int age;
    String gender;

    public static void main(String[] args) {
        String phrase = "We are learing loops";

        for (int i = 0; i < 10; i++) {
            System.out.println(phrase);
        }
        LearnForLoop loops = new LearnForLoop();
        loops.doSomething();
    }
    void doSomething(){
        LearnForLoop learn = new LearnForLoop();
       int nowit = learn.age = 10;
        System.out.println(nowit);

    }
}
