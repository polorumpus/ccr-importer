/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ohd.pophealth.json.clinicalmodel;

/**
 *
 * @author ohdohd
 */
public class VitalSign extends Result{

    public VitalSign(String id){
        super(id);
    }

    @Override
    protected String getCategory(){
        return "physical_exam";
    }
}
