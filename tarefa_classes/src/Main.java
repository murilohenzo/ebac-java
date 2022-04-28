public class Main {
    public static void main(String[] args) {
        Account account = new Account("Murilo", 23, 'M');
        System.out.println(account);
        System.out.println("name = " + account.getName());
        System.out.println("age = " + account.getAge());
        System.out.println("sex = " + account.getSex());

        System.out.println("sex = " + account.verifySex());

    }
}