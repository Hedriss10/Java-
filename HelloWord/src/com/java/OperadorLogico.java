package com.java;

public class OperadorLogico {

	public static void main(String[] args) {
		
		int idade = 90;
		boolean precisoVotar = idade >= 18 && idade < 70;
		
		int nrAmarelo =  2, nrVermelho =3 ;
		
		boolean checar = nrAmarelo == 3 || nrVermelho == 3;
		System.out.println(precisoVotar);
		System.out.println(checar);
		
	}
}