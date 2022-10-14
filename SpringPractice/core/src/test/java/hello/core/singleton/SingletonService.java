package hello.core.singleton;

public class SingletonService {

    // static으로 선언할 경우 클래스 레벨에서 딱 하나만 존재하게 됨
    private static final SingletonService instance = new SingletonService();

    // SingletonService를 생성할 수 있는 방법은 없으며,
    // 아래의 getInstance()를 통해 참조하는 경우의 수 밖에 존재하지 않는다.
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("singleton logic called");
    }
}
