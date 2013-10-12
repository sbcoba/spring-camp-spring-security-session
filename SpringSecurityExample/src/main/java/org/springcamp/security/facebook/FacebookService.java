package org.springcamp.security.facebook;

public interface FacebookService {
	/**
	 * Facebook에서 사용자 정보를 가져온다.
	 * @return Facebook사용자 정보
	 */
	FacebookUser findUser();
}
