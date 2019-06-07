package com.app.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("From AppRunner Class");
		
		//--------------OPTION ARGS---------------
		//-----1.READING ONLY KEYS---------
		Set<String> optkeys=args.getOptionNames();
		System.out.println("option arguments keys: "+optkeys);
		//-----1.READING ONLY VALUES---------
		List<String> optval=args.getOptionValues("role");
		System.out.println("option arguments values: "+optval);
		
		//--------------NON-OPTION ARGS---------------
		List<String> nonoptargs=args.getNonOptionArgs();
		System.out.println("non-option arguments: "+nonoptargs);
	}

	
	

}
