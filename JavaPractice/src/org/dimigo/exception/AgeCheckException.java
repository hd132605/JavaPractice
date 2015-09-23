package org.dimigo.exception;

public class AgeCheckException extends Exception {
	public AgeCheckException() {
		super();
	}
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람 영화입니다.");
	}
}
