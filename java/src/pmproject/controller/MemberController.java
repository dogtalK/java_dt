package pmproject.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import pmproject.service.MemberService;
import pmproject.service.MemberServiceImp;
import pmproject.vo.DeptVO;
import pmproject.vo.MemberVO;
import pmproject.vo.SalaryHistoryVO;
import pmproject.vo.SalaryVO;
import pmproject.vo.TransferVO;

public class MemberController {

	private MemberService memberService = new MemberServiceImp();
	Scanner sc = new Scanner(System.in);

	public void run() {
		int menu;
		final int EXIT = 5;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
		
	}


	private void printMenu() {
		System.out.println("=====직원 관리=====");
		System.out.println("1. 직원 등록");
		System.out.println("2. 직원 정보 관리");
		System.out.println("3. 직원 휴가 관리");
		System.out.println("4. 직원 퇴사/휴직 관리");
		System.out.println("5. 이전 메뉴");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			register();
			break;
		case 2:
			infoManagementMenu();
			break;
		case 3:
			leaveManagementMenu();
			break;
		case 4:
			retirementManagementMenu();
			break;
		case 5:
			System.out.println("[이전메뉴로 이동]");
			break;
		default:
			System.out.println("[잘못된 메뉴 선택!]");
		}
		
	}


	private void infoManagementMenu() {
		int menu;
		final int EXIT = 8;
		do {
			System.out.println("=====직원 정보 관리=====");
			System.out.println("1. 직원 조회");
			System.out.println("2. 직원 연락처 수정");
			System.out.println("3. 직원 부서 이동");
			System.out.println("4. 직원 부서 이동 내역 조회");
			System.out.println("5. 직원 급여 수정");
			System.out.println("6. 급여 지급");
			System.out.println("7. 직원 급여 이력 조회");
			System.out.println("8. 이전 메뉴");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				searchMember();
				break;
			case 2:
				modifyContact();
				break;
			case 3:
				modifyDepartment();
				break;
			case 4:
				searchTransfer();
				break;
			case 5:
				modifySalary();
				break;
			case 6:
				giveSalary();
				break;
			case 7:
				searchSalaryHistory();
				break;
			case 8:
				System.out.println("[이전 메뉴로 이동]");
				break;
			default:
				System.out.println("[잘못된 메뉴 선택!]");
			}
		}while(menu != EXIT);
		
	}


	private void searchTransfer() {
		System.out.println("부서 이동 내역 조회할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			List<TransferVO> transferHistory = memberService.SearchTransfer(dbMember.getEp_id());
			if(transferHistory == null) {
				System.out.println("부서이동 내역이 없습니다.");
				return;
			}
			for(TransferVO tmp : transferHistory) {
				System.out.println((transferHistory.indexOf(tmp) + 1) + ". " + tmp);
			}
	
		}
		
	}


	private void giveSalary() {
		System.out.println("급여 지급할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			System.out.println("[연락처 조회결과]");
			System.out.println("이름 : " + dbMember.getEp_name());
			System.out.println("이메일 : " + dbMember.getEp_email());
			System.out.println("연락처 : " + dbMember.getEp_phone_num());
			System.out.println("월급여(만원) : " + dbMember.getEp_salary());
			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String today = date.format(formatter);
			System.out.println("오늘 날짜 : " + today);
			System.out.println("-지급 가능한 급여 유형-");
			List<SalaryVO> SalaryTypeList = memberService.selectSalaryType();
			for(SalaryVO tmp : SalaryTypeList) {
				System.out.println((SalaryTypeList.lastIndexOf(tmp) + 1) + ". " + tmp.getPa_type());
			}
			sc.nextLine();
			System.out.print("지급할 급여 유형 : ");
			String salaryType = sc.nextLine();
			System.out.print("급여 상세 : ");
			String salaryDetail = sc.nextLine();
			System.out.println("급여액(만원) : ");
			int salary = sc.nextInt();
			if(memberService.insertSalaryHistory(dbMember.getEp_id(), salaryType, salaryDetail, today, salary)) {
				System.out.println("[급여 지급 완료]");
			} else {
				System.out.println("[급여 지급 실패]");
			}			
		}
		
	}


	private void searchSalaryHistory() {
		System.out.println("급여 내역 조회할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			List<SalaryHistoryVO> salaryHistory = memberService.SearchSalaryHistory(dbMember.getEp_id());
			if(salaryHistory == null) {
				System.out.println("급여 지급 이력이 없습니다.");
				return;
			}
			for(SalaryHistoryVO tmp : salaryHistory) {
				System.out.println((salaryHistory.indexOf(tmp) + 1) + ". " + tmp);
			}
	
		}
		
	}


	private void modifySalary() {
		System.out.print("수정할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			System.out.println("[연락처 조회결과]");
			System.out.println("이름 : " + dbMember.getEp_name());
			System.out.println("이메일 : " + dbMember.getEp_email());
			System.out.println("연락처 : " + dbMember.getEp_phone_num());
			System.out.println("월급여(만원) : " + dbMember.getEp_salary());
			System.out.print("변경된 월급여(만원) : ");
			int salary = sc.nextInt();
			if(memberService.updateSalary(phone, salary)) {
				System.out.println("[급여 변경 완료]");
			} else {
				System.out.println("[급여 변경 실패]");
			}			
		}
	}


	private void modifyDepartment() {
		System.out.print("수정할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			System.out.println("[연락처 조회결과]");
			System.out.println("이름 : " + dbMember.getEp_name());
			System.out.println("이메일 : " + dbMember.getEp_email());
			System.out.println("연락처 : " + dbMember.getEp_phone_num());
			System.out.println("부서 : " + dbMember.getEp_dept());
			System.out.println("-부서 목록-");
			List<DeptVO> deptList = memberService.selectAllDept();
			for(DeptVO tmp : deptList) {
				System.out.println(tmp.getDm_num() + ". " + tmp.getDm_name());
			}
			System.out.print("변경된 부서 번호 : ");
			int dept = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 이동 사유 : ");
			String reason = sc.nextLine();
			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String today = date.format(formatter);
			if(memberService.updateDept(phone, dept, reason, today, dbMember.getEp_id())) {
				System.out.println("[부서 변경 완료]");
			} else {
				System.out.println("[부서 변경 실패]");
			}
			
		}
			
	}


	private void modifyContact() {
		System.out.print("수정할 직원 연락처 : ");
		String phone = sc.next();
		if(memberService.selectMember(phone) == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			MemberVO dbMember = memberService.selectMember(phone);
			System.out.println("[연락처 조회결과]");
			System.out.println("이름 : " + dbMember.getEp_name());
			System.out.println("이메일 : " + dbMember.getEp_email());
			System.out.println("연락처 : " + dbMember.getEp_phone_num());
			System.out.print("변경된 연락처 : ");
			String newPhone = sc.next();
			if(memberService.updatePhone(phone, newPhone)) {
				System.out.println("[연락처 변경 완료]");
			} else {
				System.out.println("[연락처 변경 실패]");
				}
				
			}
			
		}
		


	private void searchMember() {
		System.out.print("조회할 직원 연락처 : ");
		String phone = sc.next();
		MemberVO dbMember = memberService.selectMember(phone);
		if(dbMember == null) {
			System.out.println("[직원 조회 실패]");
		} else {
			System.out.println(dbMember);
		}
		
	}


	private void leaveManagementMenu() {
		int menu;
		final int EXIT = 3;
		do {
			System.out.println("=====직원 휴가 관리=====");
			System.out.println("1. 직원 휴가 조회");
			System.out.println("2. 직원 휴가 신청");
			System.out.println("3. 이전 메뉴");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				searchLeave();
				break;
			case 2:
				useLeave();
				break;
			case 3:
				System.out.println("[이전 메뉴로 이동]");
				break;
			default:
				System.out.println("[잘못된 메뉴 선택!]");
			}
		}while(menu != EXIT);
		
	}


	private void useLeave() {
		// TODO Auto-generated method stub
		
	}


	private void searchLeave() {
		// TODO Auto-generated method stub
		
	}


	private void register() {
		
		System.out.print("직원 이름 : ");
		String name = sc.next();
		System.out.print("직원 이메일 : ");
		String email = sc.next();
		System.out.print("직원 연락처 : ");
		String phone = sc.next();
		System.out.print("협상 월급여(만원) : ");
		int salary = sc.nextInt();
		MemberVO member = new MemberVO(name, email, phone, salary);
		if(memberService.insertMember(member)) {
			System.out.println("[직원 등록 완료]");
		} else {
			System.out.println("[직원 등록 실패]");
		}	
		
	}
	
	private void retirementManagementMenu() {
		int menu;
		final int EXIT = 4;
		do {
			System.out.println("=====직원 퇴사/휴직 관리=====");
			System.out.println("1. 직원 퇴사/휴직 조회");
			System.out.println("2. 직원 퇴사 처리");
			System.out.println("3. 직원 휴직 처리");
			System.out.println("4. 이전 메뉴");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				searchRetirement();
				break;
			case 2:
				doRetirement();
				break;
			case 3:
				doBreak();
				break;
			case 4:
				System.out.println("[이전 메뉴로 이동]");
				break;
			default:
				System.out.println("[잘못된 메뉴 선택!]");
			}
		}while(menu != EXIT);
		
	}


	private void doBreak() {
		// TODO Auto-generated method stub
		
	}


	private void doRetirement() {
		// TODO Auto-generated method stub
		
	}


	private void searchRetirement() {
		// TODO Auto-generated method stub
		
	}



}
