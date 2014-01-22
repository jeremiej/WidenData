/**************************************************************
 ********          THIS IS A GENERATED FILE         ***********
 **************************************************************/

package com.accenture.cdi.widen.data;

public class BookSensor
{
    /**
     * Unique ID of the book.
     */
    public String id;

    public BookSensor()
    {
    }

    public BookSensor(String id) {
    	this.id = id;
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
        final BookSensor myObj = (BookSensor)obj;
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
