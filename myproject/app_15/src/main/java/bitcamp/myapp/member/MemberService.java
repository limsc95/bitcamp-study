package bitcamp.myapp.member;

public interface MemberService {
  Member get(String email, String password);
  Member get(String email);

  int changePassword(String email, String newPassword);
}
