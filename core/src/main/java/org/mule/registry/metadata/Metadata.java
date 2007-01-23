/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.registry.metadata;

public class Metadata
{
    public static int PROPERTY_KEY = 1;
    public static int PROPERTY_PERSISTABLE = 2;
    public static int PROPERTY_MUTABLE = 4;
    public static int PROPERTY_TRANSIENT = 8;
    public static int PROPERTY_CONFIG_DEFINED = 16;

    protected String mappedName = null;
    protected int flags = 0;
    protected int datatype = 0;

    public Metadata()
    {
    }

    public void setMappedName(String mappedName)
    {
        this.mappedName = mappedName;
    }

    public String getMappedName()
    {
        return mappedName;
    }

    public void setIsKey()
    {
        flags = flags | PROPERTY_KEY;
    }

    public boolean getIsKey()
    {
	return ((flags & PROPERTY_KEY) == PROPERTY_KEY ? true : false);
    }

    public void setIsPersistable()
    {
        flags = flags | PROPERTY_PERSISTABLE;
    }

    public boolean getIsPersistable()
    {
	return ((flags & PROPERTY_PERSISTABLE) == PROPERTY_PERSISTABLE ? true : false);
    }

    public void setIsMutable()
    {
        flags = flags | PROPERTY_MUTABLE;
    }

    public boolean getIsMutable()
    {
	return ((flags & PROPERTY_MUTABLE) == PROPERTY_MUTABLE ? true : false);
    }

    public void setIsTransient()
    {
        flags = flags | PROPERTY_TRANSIENT;
    }

    public boolean getIsTransient()
    {
	return ((flags & PROPERTY_TRANSIENT) == PROPERTY_TRANSIENT ? true : false);
    }

    public void setIsConfigDefined()
    {
        flags = flags | PROPERTY_CONFIG_DEFINED;
    }

    public boolean getIsConfigDefined()
    {
	return ((flags & PROPERTY_CONFIG_DEFINED) == PROPERTY_CONFIG_DEFINED ? true : false);
    }

}
