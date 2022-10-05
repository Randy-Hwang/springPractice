import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임을 시작합니다!");
        System.out.println("뭘 내시겠어요?");
        System.out.println("(1) : 가위");
        System.out.println("(2) : 바위");
        System.out.println("(3) : 보");
        System.out.println("숫자를 입력해주세요!");

        String[] computerOption = {"가위", "바위", "보"};

        while (true) {
            System.out.println("게임 종료를 원하시면 0을 눌러주세요 : ");
            input = scanner.nextLine();
            int inputNum = Integer.parseInt(input);

            if (!(0 <= inputNum && inputNum <= 3)) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            } else if (inputNum == 0) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            int computerSelected = (int)(Math.random() *3);
            System.out.println("당신이 낸 것 : " + computerOption[inputNum - 1]);
            System.out.println("컴퓨터가 낸 것 : " + computerOption[computerSelected]);

            switch (inputNum) {
                case 1 :
                    if (computerSelected == 0) {
                        System.out.println("비겼습니다!");
                        break;
                    } else if (computerSelected == 1) {
                        System.out.println("졌습니다!");
                        break;
                    } else {
                        System.out.println("이겼습니다!");
                        break;
                    }
                case 2 :
                    if (computerSelected == 0) {
                        System.out.println("이겼습니다!");
                        break;
                    } else if (computerSelected == 1) {
                        System.out.println("비겼습니다!");
                        break;
                    } else {
                        System.out.println("졌습니다!");
                        break;
                    }
                case 3 :
                    if (computerSelected == 0) {
                        System.out.println("졌습니다!");
                        break;
                    } else if (computerSelected == 1) {
                        System.out.println("이겼습니다!");
                        break;
                    } else {
                        System.out.println("비겼습니다!");
                        break;
                    }
            }
        }
    }
}

