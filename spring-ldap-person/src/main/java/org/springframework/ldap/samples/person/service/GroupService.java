/*
 * Copyright 2005-2006 the original author or authors.
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
package org.springframework.ldap.samples.person.service;

import java.util.List;
import java.util.Set;

import org.springframework.ldap.samples.person.domain.Group;
import org.springframework.ldap.samples.person.domain.SearchCriteria;

/**
 * Example interface for a Group service.
 * 
 * @author Ulrik Sandberg
 */
public interface GroupService {

    public void create(String name, Set members);

    public void update(Group group);

    public void delete(Group group);

    public Group findByPrimaryKey(String name);

    public List find(SearchCriteria criteria);

    public List findAll();
}