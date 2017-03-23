package com.dessign.prototype;

public class DepartMentFactory {

	public static DepartMent getDeptDetail(DepartMentAbstractFactory factory) {
		return factory.createDepartment();
	}
}
