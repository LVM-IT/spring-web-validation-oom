package lvm.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class DemoApplicationTests {

	@Test
	void contextLoads() throws IOException {

        EmailAttachement attachement = new EmailAttachement();
        attachement.setName("demo");

        byte[] bytes = new byte[6_000_000];
        Random random = new Random();
        random.nextBytes(bytes);
        attachement.setAttachement(bytes);

        File file = new File("./attachement.json");
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(file, attachement);

	}

}
