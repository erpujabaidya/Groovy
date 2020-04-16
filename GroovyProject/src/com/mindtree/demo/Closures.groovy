package com.mindtree.demo
//Closure is a block of code which and refer variable,return values and passed as parameter in a method

def str= "Hello"

def  closure ={ name -> println "$str $name"}
	

closure.call("Campus Minds")
 

def closure2= {
	a,b,c->a+b+c
	return (a+b+c)
}
println closure2 (10,20,30)