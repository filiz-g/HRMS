package project.hrms.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService{

	@Override
	public void sendLink(String email) {

		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println(email+" adresine doğrulama kodunuz gönderildi ");
		System.out.println("Hesabınızı doğrulamak için gönderilen bağlantıya tıklayıızn:  " + verificationLink );
		
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Aktivasyon kodunuz--> " + verificationCode );
		return verificationCode;
	}

}
