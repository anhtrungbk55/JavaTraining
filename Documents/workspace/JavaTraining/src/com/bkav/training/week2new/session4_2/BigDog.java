package com.bkav.training.week2new.session4_2;

public class BigDog extends Dog {
	@Override
	public void greeting() {
		System.out.println("Woow!");
	}

	@Override
	public void greeting(Dog another) {
		System.out.println("Woooooowwwww!");
	}
}
