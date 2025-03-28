package bitcamp.myapp.member;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberDao {
  Member findByEmailAndPassword(
          @Param("email") String email,
          @Param("password") String password);

    Member findByEmail(String email);

  int updatePassword(String email, String newPassword);
}
