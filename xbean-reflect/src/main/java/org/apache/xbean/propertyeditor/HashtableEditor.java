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
package org.apache.xbean.propertyeditor;

import java.util.Hashtable;
import java.util.Map;

/**
 * A property editor for indirect property bundles.  This editor
 * transforms the text value of the propery into a Property resource bundle.
 *
 * @version $Rev: 6680 $
 */
public class HashtableEditor extends AbstractMapConverter {
    public HashtableEditor() {
        super(Hashtable.class);
    }

    protected Map createMap(Map map) {
        Map finalMap = new Hashtable(map);
        return finalMap;
    }
}
