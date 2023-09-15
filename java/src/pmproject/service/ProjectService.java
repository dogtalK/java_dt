package pmproject.service;

import java.util.List;

import pmproject.vo.ProjectVO;

public interface ProjectService {

	List<ProjectVO> getPjNow();

	List<ProjectVO> getPjSoon();

	List<ProjectVO> getPjDone();

	List<ProjectVO> getPjAll();

	boolean insertProject(ProjectVO project);

	



}
