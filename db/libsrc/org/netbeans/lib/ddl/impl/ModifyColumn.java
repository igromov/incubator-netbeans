/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.lib.ddl.impl;

import java.util.*;
import org.netbeans.lib.ddl.*;
import org.netbeans.lib.ddl.impl.*;

/**
* Interface of database action command. Instances should remember connection
* information of DatabaseSpecification and use it in execute() method. This is a base interface
* used heavily for sub-interfacing (it is not subclassing :)
*
* @author Slavek Psenicka
*/

public class ModifyColumn extends ColumnCommand
{
    static final long serialVersionUID =2870433389508513811L;
    public AbstractTableColumn specifyColumn(String type, String name)
    throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        return specifyColumn(type, name, Specification.MODIFY_COLUMN, 
                false, false);
    }

    public AbstractTableColumn specifyColumn(String name)
    throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        return specifyColumn(TableColumn.COLUMN, name, 
            Specification.MODIFY_COLUMN, false, false);
    }
}

/*
* <<Log>>
*  4    Gandalf   1.3         10/22/99 Ian Formanek    NO SEMANTIC CHANGE - Sun 
*       Microsystems Copyright in File Comment
*  3    Gandalf   1.2         9/10/99  Slavek Psenicka 
*  2    Gandalf   1.1         8/17/99  Ian Formanek    Generated serial version 
*       UID
*  1    Gandalf   1.0         5/14/99  Slavek Psenicka 
* $
*/
