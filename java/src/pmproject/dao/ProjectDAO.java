package pmproject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pmproject.vo.ProjectVO;

public interface ProjectDAO {

	List<ProjectVO> selectProjectNow();

	List<ProjectVO> selectProjectSoon();

	List<ProjectVO> selectProjectDone();

	List<ProjectVO> selectProjectAll();

	ProjectVO selectProject(@Param("pj_name")String pj_name);

	void insertProject(@Param("project")ProjectVO project);


	






}
