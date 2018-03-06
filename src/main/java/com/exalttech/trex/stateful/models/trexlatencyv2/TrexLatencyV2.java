/*
 *
 *  * *****************************************************************************
 *  * Copyright (c) 2016
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  ******************************************************************************
 *
 */

package com.exalttech.trex.stateful.models.trexlatencyv2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author BassamJ
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "name",
        "type",
        "data"
})
public class TrexLatencyV2 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Long type;
    @JsonProperty("data")
    private Data data;

    /**
     * No args constructor for use in serialization
     */
    public TrexLatencyV2() {
        //constructor
    }

    /**
     * @param name
     * @param data
     * @param type
     */
    public TrexLatencyV2(String name, Long type, Data data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The type
     */
    @JsonProperty("type")
    public Long getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * @return The data
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * @param data The data
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

}
