package com.mindtree.demo

//for loop
for(i=1;i<5;i++) {
	println i
}

//for in loop
for(i in 1..5) {
	println i
}
//upto
1.upto(4) {
	println "$it"
}
 10.times { println "$it" }
 
 20.step(40, 2) {println "$it"   }
 for (u in [1,3,4,6]) {
	 println u
 }
 
 def map=["name":"puja", "position":"c1"]
 for(r in map) {
	 println r
	 println r.key
	 println r.value
 }
 
 
 //while loop
 
 int i=2;
 while(i<5) {
	 println i
	 i++
 }
 
 
 