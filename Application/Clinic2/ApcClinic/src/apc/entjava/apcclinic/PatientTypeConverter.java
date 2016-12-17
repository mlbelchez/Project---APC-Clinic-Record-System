package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.PatientTypeService;
import apc.entjava.apcclinic.model.PatientType;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;

/**
 * Created by Aira Joyce on 12/17/2016.
 */
@ManagedBean(name = "patientTypeBean")
@RequestScoped
public class PatientTypeConverter implements Converter {

    private PatientTypeService patientTypeService;
    private PatientType patientType;

    @Override public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {   return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return null;
    }

    //@PersistenceContext
   //private EntityManager em;
/*
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if ((value == null) || value.isEmpty()){
            return  null;
        }try{
            return patientTypeService.find(Long.valueOf(value));
        }catch(NumberFormatException e){
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid Patient Type", value)), e);
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object modelValue) {
        if (modelValue == null){
            return "";
        }
        if (modelValue instanceof PatientType){
            return (String.valueOf(p)).getId().toString();
        }

    }
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }

        if (modelValue instanceof User) {
            return String.valueOf(((User) modelValue).getId());
        } else {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User", modelValue)), e);
        }
    }
*/
}
