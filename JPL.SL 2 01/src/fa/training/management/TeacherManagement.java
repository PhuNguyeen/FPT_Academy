/**
* 
*	author: Nguyễn Đưc Phú
*	date   Jan 18, 2022
*	Lab 605
*
*/
package fa.training.management;

import fa.training.entities.EnglishTeacher;
import fa.training.entities.MathTeacher;
import fa.training.entities.Teacher;

public class TeacherManagement {

	public static void main(String[] args) {

		MathTeacher mathTeacher = new MathTeacher("Teacher", "FU", "Math");
		MathTeacher mathTeacher2 = new MathTeacher("Teacher", "PTIT", "Math");
		EnglishTeacher englishTeacher = new EnglishTeacher("Teacher", "PTIT", "English");
		
		MathTeacher mathTeacher3 = new MathTeacher("Teacher 1", "UTC", "Math");
		EnglishTeacher englishTeacher2 = new EnglishTeacher("Teacher 2", "UTC", "English");
		
		Teacher[] teachers = new Teacher[5];
		teachers[0] = mathTeacher;
		teachers[1] = mathTeacher2;
		teachers[2] = englishTeacher;

		teachers[3] = mathTeacher3;
		teachers[4] = englishTeacher2;
		
		int number1 = 100, number2 = 20;

		for (int i = 0; i < teachers.length; i++) {
			System.out.println("----------TEACHER " + (i + 1) + "-------------");
			System.out.println("Designation: " + teachers[i].getDesignation());
			if (teachers[i] instanceof MathTeacher) {
				// 27: Ép kiểu chuyển 1 đối tượng là một thể hiện của lớp
				// cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
				System.out.println("Main subject: " + ((MathTeacher) teachers[i]).getMainSubject());
				// 29: Ép kiểu chuyển 1 đối tượng là một thể hiện của lớp
				// cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
				((MathTeacher) teachers[i]).toSchool();

				teachers[i].teach();
				System.out.println("SUM(" + number1 + ", " + number2 + ") = " + mathTeacher.sum(number1, number2));

			} else {
				// 36: Ép kiểu chuyển 1 đối tượng là một thể hiện của lớp
				// cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
				System.out.println("Main subject: " + ((EnglishTeacher) teachers[i]).getMainSubject());
				// 38: Ép kiểu chuyển 1 đối tượng là một thể hiện của lớp
				// cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
				((EnglishTeacher) teachers[i]).toSchool();

				teachers[i].teach();
				// 42: Ép kiểu chuyển 1 đối tượng là một thể hiện của lớp
				// cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
				System.out.println(((EnglishTeacher) teachers[i]).translate("Hello", "Xin chao!"));
			}
		}
		
		//
	}
}