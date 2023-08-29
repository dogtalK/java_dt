package kr.kh.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kh.study.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

}
