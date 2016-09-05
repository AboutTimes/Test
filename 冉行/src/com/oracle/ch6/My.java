package com.oracle.ch6;

import java.util.Comparator;

public class My implements Comparator {
				public  int compare(Object o1,Object o2){
					Dema d=(Dema)o1;
					Dema d1=(Dema)o2;
					
					int result=d.age-d1.age;
					int result1=d.name.hashCode()-d1.name.hashCode();
					int i = -1;
					
					if(result==0 && result1==0){
						i=0;
					}
					return i;
				}
					
				
}
