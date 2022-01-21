/**
* 
*	author: KEN
*	date   Jan 21, 2022
*	Lab/Assignment
*
*/
package fa.traning.models;

import java.util.Comparator;

public class CourseTitleCompare implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getId().compareToIgnoreCase(o2.getId());
	}

}