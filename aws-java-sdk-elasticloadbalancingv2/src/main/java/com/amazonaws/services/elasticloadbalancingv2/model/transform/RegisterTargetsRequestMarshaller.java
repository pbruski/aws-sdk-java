/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RegisterTargetsRequest Marshaller
 */

public class RegisterTargetsRequestMarshaller implements Marshaller<Request<RegisterTargetsRequest>, RegisterTargetsRequest> {

    public Request<RegisterTargetsRequest> marshall(RegisterTargetsRequest registerTargetsRequest) {

        if (registerTargetsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTargetsRequest> request = new DefaultRequest<RegisterTargetsRequest>(registerTargetsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RegisterTargets");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (registerTargetsRequest.getTargetGroupArn() != null) {
            request.addParameter("TargetGroupArn", StringUtils.fromString(registerTargetsRequest.getTargetGroupArn()));
        }

        java.util.List<TargetDescription> targetsList = registerTargetsRequest.getTargets();

        if (targetsList != null) {
            if (targetsList.isEmpty()) {
                request.addParameter("Targets", "");
            } else {
                int targetsListIndex = 1;

                for (TargetDescription targetsListValue : targetsList) {

                    if (targetsListValue.getId() != null) {
                        request.addParameter("Targets.member." + targetsListIndex + ".Id", StringUtils.fromString(targetsListValue.getId()));
                    }

                    if (targetsListValue.getPort() != null) {
                        request.addParameter("Targets.member." + targetsListIndex + ".Port", StringUtils.fromInteger(targetsListValue.getPort()));
                    }
                    targetsListIndex++;
                }
            }
        }

        return request;
    }

}
