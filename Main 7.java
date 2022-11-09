public class Main {
    public static void main(String[] args) {
        System.out.println("Создать класс для счетов, добавить метод перевода денежных средств с одного счета на другой");
        MoneyTransfer person = new MoneyTransfer();
        person.person_one_balance = 5000;
        person.person_two_balance = 876867;
        person.print_balance_person_one();
        person.print_balance_person_two();

        person.give_money_to_second(200);
        person.print_balance_person_one();
        person.print_balance_person_two();

        person.give_money_to_first(200);
        person.print_balance_person_one();
        person.print_balance_person_two();
    }
}
class MoneyTransfer{
    int person_one_balance;
    int person_two_balance;
    void give_money_to_first(int pay){
        if(this.person_two_balance >= pay){
            System.out.println("Пополнение баланса первого пользователя на (" + pay + ")");
            this.person_two_balance -= pay;
            this.person_one_balance += pay;
        }
        else
            System.out.println("Недостаточно средств");
    }
    void give_money_to_second(int pay){
        if(this.person_one_balance >= pay) {
            System.out.println("Пополнение баланса второго пользователя на (" + pay + ")");
            this.person_one_balance -= pay;
            this.person_two_balance += pay;
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }
    void print_balance_person_one(){
        System.out.println("Баланс первого пользователя: " + person_one_balance);
    }
    void print_balance_person_two(){
        System.out.println("Баланс второго пользователя: " + person_two_balance);
    }
}