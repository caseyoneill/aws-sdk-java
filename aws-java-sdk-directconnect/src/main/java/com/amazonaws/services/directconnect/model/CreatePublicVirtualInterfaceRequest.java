/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest) CreatePublicVirtualInterface operation}.
 * <p>
 * Creates a new public virtual interface. A virtual interface is the
 * VLAN that transports AWS Direct Connect traffic. A public virtual
 * interface supports sending traffic to public services of AWS such as
 * Amazon Simple Storage Service (Amazon S3).
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest)
 */
public class CreatePublicVirtualInterfaceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * Detailed information for the public virtual interface to be created.
     * <p>Default: None
     */
    private NewPublicVirtualInterface newPublicVirtualInterface;

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Detailed information for the public virtual interface to be created.
     * <p>Default: None
     *
     * @return Detailed information for the public virtual interface to be created.
     *         <p>Default: None
     */
    public NewPublicVirtualInterface getNewPublicVirtualInterface() {
        return newPublicVirtualInterface;
    }
    
    /**
     * Detailed information for the public virtual interface to be created.
     * <p>Default: None
     *
     * @param newPublicVirtualInterface Detailed information for the public virtual interface to be created.
     *         <p>Default: None
     */
    public void setNewPublicVirtualInterface(NewPublicVirtualInterface newPublicVirtualInterface) {
        this.newPublicVirtualInterface = newPublicVirtualInterface;
    }
    
    /**
     * Detailed information for the public virtual interface to be created.
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newPublicVirtualInterface Detailed information for the public virtual interface to be created.
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePublicVirtualInterfaceRequest withNewPublicVirtualInterface(NewPublicVirtualInterface newPublicVirtualInterface) {
        this.newPublicVirtualInterface = newPublicVirtualInterface;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getNewPublicVirtualInterface() != null) sb.append("NewPublicVirtualInterface: " + getNewPublicVirtualInterface() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getNewPublicVirtualInterface() == null) ? 0 : getNewPublicVirtualInterface().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePublicVirtualInterfaceRequest == false) return false;
        CreatePublicVirtualInterfaceRequest other = (CreatePublicVirtualInterfaceRequest)obj;
        
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getNewPublicVirtualInterface() == null ^ this.getNewPublicVirtualInterface() == null) return false;
        if (other.getNewPublicVirtualInterface() != null && other.getNewPublicVirtualInterface().equals(this.getNewPublicVirtualInterface()) == false) return false; 
        return true;
    }
    
    @Override
    public CreatePublicVirtualInterfaceRequest clone() {
        
            return (CreatePublicVirtualInterfaceRequest) super.clone();
    }

}
    