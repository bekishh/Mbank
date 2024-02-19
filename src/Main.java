import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Эскертуу, катасы жок ПИН код жазыныз, болбосо эсеп боготтолот!\nПин код жазыныз: ");
        int pinCode = scanner.nextInt();

        if (pinCode == account.getPinCode()) {
            while (true) {
                System.out.print("""
                        0. Системадан чыгуу:
                        1. Балансты текшеруу:
                        2. Депозит акча:
                        3. Накталай акча алуу:
                        Тандоонузду киргизиниз:
                        """);
                int command = scanner.nextInt();

                if (command == 0) {
                    System.out.println("Кунунуз маанайлуу отсун.");
                    break;
                }

                switch (command) {
                    case 1:
                        System.out.println("Сиздин балансыныз: $" + account.checkBalance());
                        break;
                    case 2:
                        System.out.print("Депозитке сумманы киргизиниз: ");
                        int depositSum = scanner.nextInt();
                        if (depositSum > 0) {
                            account.deposit(depositSum);
                        } else {
                            System.out.println("Кошуулучу сумма жарамсыз, кайра текшериниз.");
                        }

                        break;
                    case 3:
                        System.out.print("Алынуучу сумманы киргизиниз: ");
                        int withdrawal = scanner.nextInt();
                        if (withdrawal <= account.checkBalance()) {
                            account.withdrawal(withdrawal);
                        } else {
                            System.out.println("Баланс жетишсиз, жарактуу сумманы киргизиниз.");
                        }
                        break;
                    default:
                        System.out.println("Жарамсыз тандоо. Тандоонузду текшерип, кайра киргизиниз.");
                }
            }
        } else {
            System.out.println("Жараксыз ПИН код. Катто эсебиниз боготолду.");
        }

    }
}