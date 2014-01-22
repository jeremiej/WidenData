/**************************************************************
 ********          THIS IS A GENERATED FILE         ***********
 **************************************************************/

package com.accenture.cdi.widen.data;

import org.qeo.Key;

public class Door
{
    /**
     * Unique ID of the door.
     */
    @Key
    public String id;

    /**
     * State of the door.
     */
    public boolean open;

    public Door()
    {
    }

    public Door(String id, boolean open) {
    	this.id = id;
    	this.open = open;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        final Door myObj = (Door)obj;
        if (!id.equals(myObj.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
