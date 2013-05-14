/*
 * Copyright (c) www.bugull.com
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

package com.bugull.mongo.mapper;

import com.mongodb.DBObject;

/**
 * for @EnsureIndex
 * 
 * @author Frank Wen(xbwen@hotmail.com)
 */
public class DBIndex {
    
    private DBObject keys;
    private DBObject options;

    public DBObject getKeys() {
        return keys;
    }

    public void setKeys(DBObject keys) {
        this.keys = keys;
    }

    public DBObject getOptions() {
        return options;
    }

    public void setOptions(DBObject options) {
        this.options = options;
    }
    
}
