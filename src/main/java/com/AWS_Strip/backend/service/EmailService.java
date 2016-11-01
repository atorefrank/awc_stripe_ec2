package com.AWS_Strip.backend.service;

import com.AWS_Strip.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by francisatore on 10/31/16.
 */

public interface EmailService {

    /**
     * Sends an email with the content in the Feedback Pojo
     * @param feedbackPojo The feedback Pojo
     */

    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    public void sendGenericEmailMessage(SimpleMailMessage message);
}
