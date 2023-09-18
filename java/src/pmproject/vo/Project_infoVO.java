package pmproject.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project_infoVO {

	private int pi_num; 
	private String pi_ep_id; 
	private int pi_pj_num; 
	private String pi_role;
}
