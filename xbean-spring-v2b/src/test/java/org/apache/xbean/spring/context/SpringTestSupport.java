/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xbean.spring.context;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractXmlApplicationContext;

import junit.framework.TestCase;

/**
 * A useful base class for testing spring based utilities.
 * 
 * @author James Strachan
 * @version $Id$
 * @since 2.0
 */
public abstract class SpringTestSupport extends TestCase {
    protected transient Log log = LogFactory.getLog(getClass());

    protected AbstractXmlApplicationContext context;

    protected void setUp() throws Exception {
        context = createApplicationContext();
        assertNotNull("ApplicationContext is null!", context);
    }

    protected void tearDown() throws Exception {
        if (context != null) {
            log.info("Closing down the spring context");
            context.destroy();
        }
    }

    protected Object getBean(String name) {
        Object answer = answer = context.getBean(name);
        assertNotNull("Could not find object in Spring for key: " + name, answer);
        return answer;
    }

    protected abstract AbstractXmlApplicationContext createApplicationContext();
}
