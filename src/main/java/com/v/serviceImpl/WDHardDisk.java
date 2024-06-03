package com.v.serviceImpl;

import org.springframework.stereotype.Component;

import com.v.service.HardDisk;

@Component("WDHDD")
public class WDHardDisk implements HardDisk {

	@Override
	public String bootHdd() {
		return "Booting WD Hard Disk...";
	}

}
