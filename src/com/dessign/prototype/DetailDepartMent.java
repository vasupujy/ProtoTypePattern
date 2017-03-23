package com.dessign.prototype;

public class DetailDepartMent {
	public static void main(String[] args) {

		DepartMent pc = DepartMentFactory.getDeptDetail(new AndroidFactory(
				"Spade", "120 months", "mvvm", "12"));
		DepartMent server = DepartMentFactory.getDeptDetail(new PhpFactory(
				"Andrid", "12 months", "mvvm", "12"));
		System.out.println("AbstractFactory PC Config::"
				+ new Android.AndroidBuilder("UniBuy", "5 Year", "MVVM",
						"12 member").setTimeLineIsOptional(false).build());
		System.out.println("AbstractFactory Server Config::" + server);
	}
}
