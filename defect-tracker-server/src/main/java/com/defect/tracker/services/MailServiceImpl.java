package com.defect.tracker.services;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements CommandLineRunner {
	@Autowired
	private JavaMailSender javaMailSender;

//	@Autowired
//	ModuleService moduleService;
	@Override
	public void run(String... args) throws MessagingException, IOException {

	}

	public void sendListEmailNew(List<String> mails, String module, List<String> names, String assignedEmployee,
			String status) {
		SimpleMailMessage msg = new SimpleMailMessage();

		for (String mail : mails) {
			msg.setTo(mail);
			msg.setSubject("Defect " + module);
			msg.setText("Hi " + names.toString().replace("[", "").replace("]", "") + ", \n" + "A " + status
					+ " Defect Assigned by " + assignedEmployee + " in " + module);
			javaMailSender.send(msg);
		}

	}

	public void sendEmail(String mail, String module, String project, String assignedEmployee, String openedEmployee, String status) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mail);
		msg.setSubject("Defect " + module);
		msg.setText("Hi " + assignedEmployee + ", \n" + "Your Entered Defect " + status + " by " + openedEmployee  + "\n"+"Module:"+module
				+"\n"+"Project: "+project);
		javaMailSender.send(msg);
	}

	public void sendListEmail(List<String> mails, String module, List<String> names, String assignedByEmployee,
			String status) {
		SimpleMailMessage msg = new SimpleMailMessage();

		for (String mail : mails) {
			msg.setTo(mail);
			msg.setSubject("Defect " + module);
			msg.setText("Hi " + names.toString().replace("[", "").replace("]", "") + ", \n" + " Your Defect "
					+ status + " by " + assignedByEmployee + " in " + module);
			javaMailSender.send(msg);
		}

	}

	public void sendApprovalEmail(String mail, String employee, String status) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mail);
		msg.setSubject(" Account Approval ");
		msg.setText("Hi " + employee + ", \n" + "Your Account is " + status);
		javaMailSender.send(msg);
	}

	public void sendForgotEmail(String email, String token) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject(" Forgort Password ");
		msg.setText("This is the Token to Change your Password \n" + token);
		javaMailSender.send(msg);
	}

	public void sendVerifyEmail(String email, String token) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject(" Email Verification ");
		msg.setText("Click the Link to Verify your Email \n" + token);
		javaMailSender.send(msg);
	}
	
	public void sendEmailQA(String email, String module,String openedEmployee) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject(" Defect Update ");
		msg.setText("Hi " + openedEmployee + ", \n" + "Your Added Defect in " + module+ " is updated");
		javaMailSender.send(msg);
	}
	
	public void sendListEmailDV(List<String> mails, String module, List<String> names) {
		SimpleMailMessage msg = new SimpleMailMessage();

		for (String mail : mails) {
			msg.setTo(mail);
			msg.setSubject("Defect " + module);
			msg.setText("Hi " + names.toString().replace("[", "").replace("]", "") + ", \n" + "Your Defect in "+ module+"is updated");
			javaMailSender.send(msg);
		}

	}

}
