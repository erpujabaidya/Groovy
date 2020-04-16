package com.mindtree.demo

def num=0
if(num > 0) {
	println "Number is grater "
}
else if(num == 0) {
	println "Number is zero"
} 
else {
	println "Number is negative"
}

//Switch case:
def x=-10
def result =""
switch(x) {
	case 0 :
		result="X is Zero"
	break
	case {x>0}:
	result= "x is positive"
	break
	case {x<0}:
	result="X is negative"
	break
	default:
	result= "Invalid Number"
	break
	
}
println result