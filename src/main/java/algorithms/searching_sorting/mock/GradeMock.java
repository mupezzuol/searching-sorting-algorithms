package algorithms.searching_sorting.mock;

import algorithms.searching_sorting.model.Grade;

public class GradeMock {
	
	public Grade[] getMockGrades() {
		Grade[] grades = {
				new Grade("Murillo", 4.0),
				new Grade("Gabriella", 5.0),
				new Grade("Raul", 8.5),
				new Grade("Manuela", 9.0),
				new Grade("Joao", 6.7),
				new Grade("Maria", 7.0),
				new Grade("Naruto", 6.6),
				new Grade("Henrique", 9.3),
				new Grade("Adriana", 3.0),
				new Grade("Jorge", 9.4),
				new Grade("Diego", 6.8)
		};
		return grades;
	}

	public Grade[] getMockGradesSorted() {
		Grade[] grades = {
				new Grade("Adriana", 3.0),
				new Grade("Murillo", 4.0),
				new Grade("Gabriella", 5.0),
				new Grade("Naruto", 6.6),
				new Grade("Joao", 6.7),
				new Grade("Diego", 6.8),
				new Grade("Maria", 7.0),
				new Grade("Raul", 8.5),
				new Grade("Manuela", 9.0),
				new Grade("Henrique", 9.3),
				new Grade("Jorge", 9.4)
		};
		return grades;
	}

}
