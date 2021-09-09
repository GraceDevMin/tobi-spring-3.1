package spring.book.dao;

// UserDao와 ConnectionMaker 구현 클래스와의 런타임 오브젝트 의존관계를 설정하는 책임 담당
public class UserDaoTest {
    //관계설정 책임이 추가된 UserDao 클라이언트인 main() 메소드
    public static void main(String[] args) {
        ConnectionMaker connectionMaker = new DConnectionMaker();   // -> UserDao가 사용할 ConnectionMaker
                                                                    // 구현 클래스를 결정하고 오브젝트를 만듦
        UserDao userDao = new UserDao(connectionMaker);
            //1. UserDao 생성
            //2. 사용할 ConnectionMaker 타입의 오브젝트 제공. -> 결국 두 오브젝트 사이의 의존관계 설정 효과
    }
}
