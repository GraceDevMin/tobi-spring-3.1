package spring.book.dao;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }
    
    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }
    
    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }
    
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();  //분리해서 중복을 제거한 ConnectionMaker타입 오브젝트 생성 코드
    }
}
