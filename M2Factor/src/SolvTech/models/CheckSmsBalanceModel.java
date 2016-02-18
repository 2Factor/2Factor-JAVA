/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CheckSmsBalanceModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5024233155255552764L;
    private String details;
    private String status;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Details")
    public String getDetails ( ) { 
        return this.details;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Details")
    public void setDetails (String value) { 
        this.details = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 