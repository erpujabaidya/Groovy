package com.mindtree.demo

//operators tells the compiler to performs some special operations
int i=10
println i++
println i

def a=2
def b= a++ * 3
assert a == 3 && b == 6

def range = 5..10;
println(range);
println(range.get(2));
//assignment arithmatic operator
def s=4
s += 6
println s

//bitwise operators
int p= 9
int h=10
println (p & h)