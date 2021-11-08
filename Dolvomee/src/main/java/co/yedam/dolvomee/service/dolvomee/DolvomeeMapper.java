package co.yedam.dolvomee.service.dolvomee;

import java.util.List;

public interface DolvomeeMapper {
	List<DolvomeeVO> selectDolvomeeLsit();
	DolvomeeVO selectDolvomee(DolvomeeVO vo);
	int insertDolvomee(DolvomeeVO vo);
	int updateDolvomee(DolvomeeVO vo);
	int deleteDolvomee(DolvomeeVO vo);
	DolvomeeVO loginDolv(DolvomeeVO vo);
}
