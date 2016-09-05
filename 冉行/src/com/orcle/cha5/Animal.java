package com.orcle.cha5;

import java.util.List;

public class Animal {
			private String dag;
			private List<Dog> list;		
			
			public void setDag(String dag) {
				this.dag = dag;
			}
			public String getDag() {
				return dag;
			}
			public void setList(List<Dog> list) {
				this.list = list;
			}
			public List<Dog> getList() {
				return list;
			}
			public Animal(String dag,List<Dog> list){
				this.dag=dag;
				this.list=list;
			}
			
}
