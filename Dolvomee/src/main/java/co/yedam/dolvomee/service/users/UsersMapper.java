package co.yedam.dolvomee.service.users;

import java.util.List;

public interface UsersMapper {
	List<UsersVO> selectUserList();
	UsersVO selectUser(UsersVO vo);
	int insertUser(UsersVO vo);
	int updateUser(UsersVO vo);
	int deleteUser(UsersVO vo);
}