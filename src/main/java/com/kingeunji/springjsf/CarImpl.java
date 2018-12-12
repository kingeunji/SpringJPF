package com.kingeunji.springjsf;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarImpl implements CarDao {
    
    @Override
    public List<String> getCarDetails(){
        List<String> cars = new ArrayList<String>();
        
        cars.add(0,"람보르기니");
        cars.add(1,"포르쉐");
        cars.add(2,"티코");
        cars.add(3,"마티즈");
        
        for (String c : cars) {
			System.out.println(c);
		}
        
        return cars;
    }
}