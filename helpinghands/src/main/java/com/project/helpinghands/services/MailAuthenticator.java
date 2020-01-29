package com.project.helpinghands.services;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
	@Override
	public PasswordAuthentication getPasswordAuthentication() {
		char[] pass="9919389399@Sh".toCharArray();
		
    return new PasswordAuthentication("sharma14697@gmail.com",pass);
}
}