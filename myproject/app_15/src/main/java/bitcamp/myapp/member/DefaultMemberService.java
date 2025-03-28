package bitcamp.myapp.member;

import org.springframework.stereotype.Service;

@Service
public class DefaultMemberService implements MemberService {

  private MemberDao memberDao;

  public DefaultMemberService(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  public Member get(String email, String password) {
    return memberDao.findByEmailAndPassword(email, password);
  }
  public Member get(String email) {
    return memberDao.findByEmail(email);
  }

  @Override
  public int changePassword(String email, String newPassword){
    return memberDao.updatePassword(email, newPassword);
  }
}
