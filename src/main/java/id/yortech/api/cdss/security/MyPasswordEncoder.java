/*******************************************************************************
 * Copyright 2019 Yohanes Randy Kurnianto
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package id.yortech.api.cdss.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {
	private final String KEY = "CbA046mSys881";

	@Override
	public String encode(CharSequence rawPassword) {
		try {
			return CorsysPasswordEncoder.encode(rawPassword.toString().split(",")[0],
					rawPassword.toString().split(",")[1], KEY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		try {
			boolean isMatch = CorsysPasswordEncoder
					.encode(rawPassword.toString().split(",")[0], rawPassword.toString().split(",")[1], KEY)
					.equalsIgnoreCase(encodedPassword);
			return isMatch;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
