package com.qf.model.admin.valid;



import com.qf.model.Base;



/**
 * author Vareck
 */
public class ValidSaveDictionary extends Base {
	
    private Integer  did;
    
    private String   typename;
	
    private String   dkey;

    private String   dvalue;
    
 
    
    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
    
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
 
    public String getDkey() {
        return dkey;
    }

    public void setDkey(String dkey) {
        this.dkey = dkey;
    }
	
	public String getDvalue() {
        return dvalue;
    }

    public void setDvalue(String dvalue) {
        this.dvalue = dvalue;
    }
    

    
}