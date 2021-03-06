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
package com.amazonaws.services.inspector.model;

/**
 * <p>
 * Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the assessment
 * run.
 * </p>
 */
public class InvalidCrossAccountRoleException extends com.amazonaws.services.inspector.model.AmazonInspectorException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     */
    private Boolean canRetry;
    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     */
    private String inspectorErrorCode;

    /**
     * Constructs a new InvalidCrossAccountRoleException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidCrossAccountRoleException(String message) {
        super(message);
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidCrossAccountRoleException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @see InvalidCrossAccountRoleErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setInspectorErrorCode(String inspectorErrorCode) {
        this.inspectorErrorCode = inspectorErrorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @return Code that indicates the type of error that is generated.
     * @see InvalidCrossAccountRoleErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getInspectorErrorCode() {
        return this.inspectorErrorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidCrossAccountRoleErrorCode
     */

    public InvalidCrossAccountRoleException withInspectorErrorCode(String inspectorErrorCode) {
        setInspectorErrorCode(inspectorErrorCode);
        return this;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @see InvalidCrossAccountRoleErrorCode
     */

    public void setInspectorErrorCode(InvalidCrossAccountRoleErrorCode inspectorErrorCode) {
        this.inspectorErrorCode = inspectorErrorCode.toString();
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidCrossAccountRoleErrorCode
     */

    public InvalidCrossAccountRoleException withInspectorErrorCode(InvalidCrossAccountRoleErrorCode inspectorErrorCode) {
        setInspectorErrorCode(inspectorErrorCode);
        return this;
    }

}
