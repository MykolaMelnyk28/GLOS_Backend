package com.glos.notificationservice.domain.template;

import com.glos.notificationservice.domain.template.base.MessageProps;
import com.glos.notificationservice.domain.template.base.MessageTemplate;
import com.glos.notificationservice.domain.template.base.TemplateNames;
import org.thymeleaf.context.Context;

public class ChangePasswordMessageTemplate implements MessageTemplate {

    private final Context context;

    private final MessageProps props;


    public ChangePasswordMessageTemplate(MessageProps props) {
        this.context = new Context();
        this.props = props;
        context.setVariables(props.asMap());
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public String getViewName() {
        return TemplateNames.CHANGE_PASSWORD.template();
    }

    @Override
    public MessageProps getProperties() {
        return props;
    }
}
