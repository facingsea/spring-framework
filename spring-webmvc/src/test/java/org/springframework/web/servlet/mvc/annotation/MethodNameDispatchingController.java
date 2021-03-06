/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.servlet.mvc.annotation;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Juergen Hoeller
 */
@Controller
@RequestMapping("/*.do")
public class MethodNameDispatchingController {

	@RequestMapping
	public void myHandle(HttpServletResponse response) throws IOException {
		response.getWriter().write("myView");
	}

	@RequestMapping
	public void myOtherHandle(HttpServletResponse response) throws IOException {
		response.getWriter().write("myOtherView");
	}

	@RequestMapping(method = RequestMethod.POST)
	public void myLangHandle(HttpServletResponse response) throws IOException {
		response.getWriter().write("myLangView");
	}

	@RequestMapping(method = RequestMethod.POST)
	public void mySurpriseHandle(HttpServletResponse response) throws IOException {
		response.getWriter().write("mySurpriseView");
	}

}