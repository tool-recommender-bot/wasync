/*
 * Copyright 2012 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.client.impl;

import org.atmosphere.client.FunctionResolver;
import org.atmosphere.client.FunctionWrapper;

public class DefaultFunctionResolver implements FunctionResolver {
    @Override
    public boolean resolve(String message, Object functionName, FunctionWrapper fn) {
        if (fn.functionName().isEmpty() || functionName.toString().equalsIgnoreCase(fn.functionName())) {
            return true;
        }
        return false;
    }
}
