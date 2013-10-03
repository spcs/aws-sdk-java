/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Cache Subnet Groups Request Marshaller
 */
public class DescribeCacheSubnetGroupsRequestMarshaller implements Marshaller<Request<DescribeCacheSubnetGroupsRequest>, DescribeCacheSubnetGroupsRequest> {

    public Request<DescribeCacheSubnetGroupsRequest> marshall(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) {

        if (describeCacheSubnetGroupsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeCacheSubnetGroupsRequest> request = new DefaultRequest<DescribeCacheSubnetGroupsRequest>(describeCacheSubnetGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheSubnetGroups");
        request.addParameter("Version", "2013-06-15");

        if (describeCacheSubnetGroupsRequest.getCacheSubnetGroupName() != null) {
            request.addParameter("CacheSubnetGroupName", StringUtils.fromString(describeCacheSubnetGroupsRequest.getCacheSubnetGroupName()));
        }
        if (describeCacheSubnetGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheSubnetGroupsRequest.getMaxRecords()));
        }
        if (describeCacheSubnetGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheSubnetGroupsRequest.getMarker()));
        }


        return request;
    }
}
