package webdeving.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.Arrays;
import java.util.List;


@FacesValidator("rValidator")
public class RValidator implements Validator<Object> {

    private final List<Double> R_VALUES = Arrays.asList(1.0, 1.5, 2.0, 2.5, 3.0);
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        try {
            double radius = Double.parseDouble(o.toString());
            if (!R_VALUES.contains(radius)) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            throw new ValidatorException(new FacesMessage("Некорректно выбран r."));
        }
    }
}
