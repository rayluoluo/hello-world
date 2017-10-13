package com.github.rayluoluo.designpattern.p01strategy;

public class Test {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck = new RubberDuck();
		duck.performFly();
	}

}
