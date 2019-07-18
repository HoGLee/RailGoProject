package com.railgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/planner/*")
@AllArgsConstructor
public class PlannerController {

	@RequestMapping("/list.do")
	public String list() {
		return "planner/list";
	}
}
