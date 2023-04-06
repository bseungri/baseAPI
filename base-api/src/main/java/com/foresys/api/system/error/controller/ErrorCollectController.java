package com.foresys.api.system.error.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foresys.api.system.error.model.ErrorVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/error")
@Slf4j
public class ErrorCollectController {
	@PostMapping("/insert")
	public void insert(@RequestBody ErrorVO err) throws Exception{
		log.debug(err.getLocation());
		log.debug(err.getErrorText());
	}
}
