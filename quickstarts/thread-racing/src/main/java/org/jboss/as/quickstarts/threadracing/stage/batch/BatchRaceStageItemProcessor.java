/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.threadracing.stage.batch;

import jakarta.batch.api.chunk.ItemProcessor;
import jakarta.inject.Named;

/**
 * The batch component that processes/filters read items, one by one.
 * @author Eduardo Martins
 */
@Named
public class BatchRaceStageItemProcessor implements ItemProcessor {

    @Override
    public Object processItem(Object item) {
        // TODO this app must have one, but here you process a read item, in case the item should be discarded just return null
        return item;
    }
}
