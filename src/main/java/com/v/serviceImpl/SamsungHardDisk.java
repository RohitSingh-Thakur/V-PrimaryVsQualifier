package com.v.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.v.service.HardDisk;

@Component
@Primary
public class SamsungHardDisk implements HardDisk{

	@Override
	public String bootHdd() {
		return "Booting Samsung Hard Disk....";
	}

}
