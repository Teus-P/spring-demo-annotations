package springdemo.fortuneservice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    public String[] data;

    private Random random = new Random();

//    public RandomFortuneService() {
//        try {
//            setupData();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @PostConstruct
    public void setupData() throws IOException {
        String file = "src/resources/fortunes.txt";
        FileInputStream fileInputStream = new FileInputStream(file);

        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        int lines = 0;
        while(reader.readLine() != null) lines++;

        data = new String[lines];

        fileInputStream.getChannel().position(0);
        reader = new BufferedReader(new InputStreamReader(fileInputStream));

        for (int i = 0; i < data.length; i++) {
            data[i] = reader.readLine();
        }

        reader.close();
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
