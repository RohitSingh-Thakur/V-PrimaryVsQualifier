package com.v.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.v.service.HardDisk;

@Component
public class AsusLaptop {

	@Autowired
	@Qualifier("WDHDD")
	private HardDisk disk;
	
	public String buildLaptop() {
		return disk.bootHdd();
	}
}
