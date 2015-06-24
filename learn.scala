#!/bin/sh
	exec scala -savecompiled "$0" "$@"
!#

object HelloWorld {

	def fact(i : BigInt) : BigInt = i match {
		case x : BigInt if x == 0 => 1
		case _ => i * fact(i - 1)
	}

	def main(args: Array[String]) {
		args.foreach((x : String) =>
			println("Factorial of "+x+" is "+fact(x.toInt)))
	}
}
