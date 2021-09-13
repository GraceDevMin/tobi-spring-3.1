package spring.book.dao;

// 팩토리를 사용하도록 수정한 UserDaoTest
public class UserDaoTest {
    //관계설정 책임이 추가된 UserDao 클라이언트인 main() 메소드
    public static void main(String[] args) {
        UserDao userDao = new DaoFactory().userDao();
    }
}
