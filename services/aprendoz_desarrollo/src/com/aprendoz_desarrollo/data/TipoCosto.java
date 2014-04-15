
package com.aprendoz_desarrollo.data;



/**
 *  aprendoz_desarrollo.TipoCosto
 *  04/14/2014 10:05:53
 * 
 */
public class TipoCosto {

    private Integer idTipoCosto;
    private String tipoCosto;

    public TipoCosto() {
    }

    public TipoCosto(Integer idTipoCosto, String tipoCosto) {
        this.idTipoCosto = idTipoCosto;
        this.tipoCosto = tipoCosto;
    }

    public Integer getIdTipoCosto() {
        return idTipoCosto;
    }

    public void setIdTipoCosto(Integer idTipoCosto) {
        this.idTipoCosto = idTipoCosto;
    }

    public String getTipoCosto() {
        return tipoCosto;
    }

    public void setTipoCosto(String tipoCosto) {
        this.tipoCosto = tipoCosto;
    }

}