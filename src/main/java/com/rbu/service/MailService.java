package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	JavaMailSender javaMailSender;
	
	public String sendEmail(String toEmail) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom("rbu9032@gmail.com");
		mail.setTo(toEmail);
		mail.setSubject("Mail Sender Working");
		mail.setText("Congrats we successfully sent a mail");
		
		javaMailSender.send(mail);
		return "Mail Sent Successfully";
	}
}
