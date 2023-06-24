package Mediator;

public class ConcreteColleague1 extends  Colleague{
    @Override
    void receive(){
        System.out.println("I'm Concrete Colleague 1");
    }
    @Override
    void send(){
        System.out.println("I'm sending message: Concrete Mediator 1");
        mediator.resend(this);
    }
}
