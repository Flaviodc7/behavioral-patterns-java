package Mediator;

public class ConcreteColleague2 extends  Colleague{
    @Override
    void receive(){
        System.out.println("I'm Concrete Colleague 2");
    }
    @Override
    void send(){
        System.out.println("I'm sending message: Concrete Mediator 2");
        mediator.resend(this);
    }
}
